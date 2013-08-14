/**
 * Get more info at : www.jrebirth.org  
 * Copyright JRebirth.org © 2011-2013 
 * Contact : sebastien.bordes@jrebirth.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.jrebirth.forge.addon.facets.impl;

import java.util.List;
import java.util.Map;

import org.jboss.forge.addon.dependencies.Dependency;
import org.jboss.forge.addon.projects.dependencies.DependencyInstaller;
import org.jrebirth.forge.addon.facets.AbstractJRebirthFacet;
import org.jrebirth.forge.addon.facets.JRebirthFacet;

/**
 * 
 * 
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class JRebirthFacetImpl extends AbstractJRebirthFacet implements JRebirthFacet {

    public JRebirthFacetImpl(final DependencyInstaller installer) {
        super(installer);
    }

    @Override
    protected Map<Dependency, List<Dependency>> getRequiredDependencyOptions() {
        //TODO: Need to add dependency.
        return null;
    }

 

}
