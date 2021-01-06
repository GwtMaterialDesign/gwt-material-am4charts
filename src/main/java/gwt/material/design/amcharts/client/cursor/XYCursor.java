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
package gwt.material.design.amcharts.client.cursor;

import gwt.material.design.amcharts.client.axis.Axis;
import gwt.material.design.amcharts.client.series.XYSeries;
import gwt.material.design.amcore.client.base.Sprite;
import gwt.material.design.amcore.client.constants.XYCursorBehavior;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.properties.Range;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYCursor extends Cursor {

    /**
     * @see XYCursorBehavior
     */
    @JsProperty
    public String behavior;

    @JsProperty
    public boolean fullWidthLineX;

    @JsProperty
    public boolean fullWidthLineY;

    @JsProperty
    public boolean hideSeriesTooltipsOnSelection;

    @JsProperty
    public Sprite lineX;

    @JsProperty
    public Sprite lineY;

    @JsProperty
    public double maxPanOut;

    @JsProperty
    public int maxTooltipDistance;

    @JsProperty
    public Sprite selection;

    @JsProperty
    public XYSeries[] snapToSeries;

    @JsProperty
    public Axis xAxis;

    @JsProperty
    public Range xRange;

    @JsProperty
    public Axis yAxis;

    @JsProperty
    public Range yRange;

    @JsProperty
    public SpriteEventDispatcher<XYCursor> events;
}
