package org.jrebirth.forge.addon.ui.setup;

import org.jboss.forge.addon.ui.context.UIBuilder;
import org.jboss.forge.addon.ui.context.UIContext;
import org.jboss.forge.addon.ui.result.Result;
import org.jboss.forge.addon.ui.util.Categories;
import org.jboss.forge.addon.ui.util.Metadata;
import org.jrebirth.forge.addon.ui.AbstractProjectUICommand;

public class JRebirthSetupCommand extends AbstractProjectUICommand  {

    @Override
    public void initializeUI(UIBuilder builder) throws Exception {
        
        
    }

    @Override
    public Result execute(UIContext context) throws Exception {
        
        return null;
    }
    
    
    @Override
    public Metadata getMetadata()
    {
       Metadata metadata = super.getMetadata();
       return metadata.name("JRebirth Setup").description("Setup a JRebirth Project on a empty Java Project")
                .category(Categories.create(metadata.getCategory().getName(), "Setup"));
    }

}
