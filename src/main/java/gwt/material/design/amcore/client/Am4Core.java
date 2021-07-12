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

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcore.client.base.AmCoreOptions;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.language.Locale;
import gwt.material.design.amcore.client.properties.Ease;
import gwt.material.design.amcore.client.theme.ChartTheme;
import gwt.material.design.amcore.client.ui.*;
import jsinterop.annotations.*;

@JsType(isNative = true, name = "am4core", namespace = JsPackage.GLOBAL)
public class Am4Core {

    @JsProperty
    public static AmCoreOptions options;

    @JsProperty(namespace = "am4core", name = "Sprite")
    public static Sprite Sprite;

    @JsProperty(namespace = "am4core", name = "Container")
    public static Container Container;

    @JsProperty(namespace = "am4core", name = "Rectangle")
    public static Rectangle Rectangle;

    @JsProperty(namespace = "am4core", name = "Triangle")
    public static Rectangle Triangle;

    @JsProperty(namespace = "am4core", name = "Trapezoid")
    public static Trapezoid Trapezoid;

    @JsProperty(namespace = "am4core", name = "Label")
    public static Label Label;

    @JsProperty(namespace = "am4core", name = "Image")
    public static Image Image;

    @JsProperty(namespace = "am4core", name = "Circle")
    public static Circle Circle;

    @JsProperty(namespace = "am4core", name = "Line")
    public static Line Line;

    @JsProperty(namespace = "am4core", name = "ease")
    public static Ease ease;

    @JsMethod(namespace = "am4core")
    public static native Object create(String div, Object object);

    @JsMethod(namespace = "am4core")
    public static native Object create(Element div, Object chartObject);

    @JsOverlay
    public final static Object create(Widget widget, Object chartObject) {
        return create(widget.getElement(), chartObject);
    }

    @JsMethod(namespace = "am4core")
    private static native void useTheme(Object object);

    @JsMethod(namespace = "am4core")
    private static native void unuseTheme(Object object);

    @JsMethod(namespace = "am4core")
    public static native void unuseAllThemes();

    @JsMethod(namespace = "am4core")
    public static native void addLicense(String key);

    @JsOverlay
    public final static void useTheme(ChartTheme theme) {
        if (theme != null) {
            theme.loadResource();
            useTheme(theme.get());
        }
    }

    @JsOverlay
    public final static void unuseTheme(ChartTheme theme) {
        if (theme != null) {
            unuseTheme(theme.get());
        }
    }

    @JsOverlay
    public final static void addLanguage(Locale locale) {
        GwtMaterialAmCore.injectJs(locale.getResource());
    }
}
