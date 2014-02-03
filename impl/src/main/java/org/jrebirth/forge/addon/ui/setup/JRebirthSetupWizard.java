package org.jrebirth.forge.addon.ui.setup;

import javax.inject.Inject;

import org.jboss.forge.addon.facets.FacetFactory;
import org.jboss.forge.addon.ui.context.UIBuilder;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.context.UIExecutionContext;
import org.jboss.forge.addon.ui.metadata.UICommandMetadata;
import org.jboss.forge.addon.ui.result.Result;
import org.jboss.forge.addon.ui.result.Results;
import org.jboss.forge.addon.ui.util.Categories;
import org.jboss.forge.addon.ui.util.Metadata;
import org.jrebirth.forge.addon.ui.AbstractJRebirthCommand;





public class JRebirthSetupWizard extends AbstractJRebirthCommand {

    @Inject
    private FacetFactory facetFactory;

    @Override
    public void initializeUI(UIBuilder builder) throws Exception {

    }

    @Override
    public Result execute(UIExecutionContext context) throws Exception {

        return Results.success("JRebirth has been installed.");
    }

    @Override
    public UICommandMetadata getMetadata(UIContext context)
    {
        return Metadata.from(super.getMetadata(context), getClass()).name("JRebirth: Setup")
                .description("Setup JRebirth in your project")
                .category(Categories.create(super.getMetadata(context).getCategory(), "JRebirth"));
    }

    @Override
    protected boolean isProjectRequired() {
        return false;
    }

}
