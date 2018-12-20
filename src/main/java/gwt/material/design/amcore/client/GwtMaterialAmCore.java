/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcore.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcore.client.resources.CoreClientBundle;

public class GwtMaterialAmCore implements EntryPoint {

    @Override
    public void onModuleLoad() {
        // Inject Am4chart resources
        injectJs(CoreClientBundle.INSTANCE.coreJs());
    }

    public static void injectJs(TextResource resource) {
        directInjectJs(resource, true, false);
    }

    protected static void directInjectJs(TextResource resource, boolean removeTag, boolean sourceUrl) {
        String text = resource.getText() + (sourceUrl ?
                "//# sourceURL=" + resource.getName() + ".js" : "");

        // Inject the script resource
        ScriptInjector.fromString(text)
                .setWindow(ScriptInjector.TOP_WINDOW)
                .setRemoveTag(removeTag)
                .inject();
    }
}
