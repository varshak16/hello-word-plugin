package com.example.hello_word_plugin;

import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class HelloWordPluginApplication extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        Messages.showInfoMessage(
                event.getProject(),
                "Hello Word from your JetBrains plugin!",
                "Hello Word"
        );
    }

    @Override
    public void update(@NotNull AnActionEvent event) {
        // Keep it always enabled for this simple sample.
        event.getPresentation().setEnabledAndVisible(true);
    }

    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }
}