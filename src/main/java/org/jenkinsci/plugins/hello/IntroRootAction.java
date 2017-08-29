package org.jenkinsci.plugins.hello;

import hudson.Extension;
import hudson.model.RootAction;


@Extension
public class IntroRootAction implements RootAction {

    @Override
    public final String getIconFileName() { return "clipboard.png"; }

    @Override
    public final String getDisplayName() { return "Intro Root Action"; }

    @Override
    public final String getUrlName() { return "http://localhost:8080/jenkins"; }
}
