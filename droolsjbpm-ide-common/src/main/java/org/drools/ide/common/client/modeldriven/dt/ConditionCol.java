/**
 * Copyright 2010 JBoss Inc
 *
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
 */

package org.drools.ide.common.client.modeldriven.dt;

/**
 * This is the config for a condition column. Typically many of them have their constraints added.
 */
@Deprecated
public class ConditionCol extends DTColumnConfig {

    /**
     * What is displayed at the top
     */
    public String header;

    /**
     * The type of the fact - class - eg Driver, Person, Cheese etc.
     */
    public String factType;

    /**
     * The name that this gets referenced as. Multiple columns with the same name mean their constraints will be combined.
     */
    public String boundName;

    /**
     * The type of the value that is in the cell, eg if it is a formula, or literal value etc.
     * The valid types are from ISingleFieldConstraint:
     *   TYPE_LITERAL
     *   TYPE_RET_VALUE
     *   TYPE_PREDICATE (in this case, the field and operator are ignored).
     */
    public int constraintValueType;


    /**
     * The field of the fact that this pertains to (if its a predicate, ignore it).
     */
    public String factField;


    /**
     * The operator to use to compare the field with the value (unless its a predicate, in which case this is ignored).
     */
    public String operator;

    /**
     * A comma separated list of valid values. Optional.
     */
    public String valueList;

}