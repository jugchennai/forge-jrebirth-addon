package org.jrebirth.forge.addon.ui;

import javax.inject.Inject;

import org.jboss.forge.addon.projects.Project;
import org.jboss.forge.addon.projects.ProjectFactory;
import org.jboss.forge.addon.resource.FileResource;
import org.jboss.forge.addon.ui.AbstractUICommand;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.context.UISelection;
import org.jboss.forge.addon.ui.util.Categories;
import org.jboss.forge.addon.ui.util.Metadata;

public abstract class AbstractProjectUICommand extends AbstractUICommand {

    @Inject
    protected ProjectFactory projectFactory;

   
    protected Project getSelectedProject(UIContext context)
    {
       Project project = null;
       UISelection<FileResource<?>> initialSelection = context.getInitialSelection();
       if (!initialSelection.isEmpty())
       {
          project = projectFactory.findProject(initialSelection.get());
       }
       return project;
    }

    @Override
    public Metadata getMetadata()
    {
       return super.getMetadata().category(Categories.create("JRebirth"));
    }

}
