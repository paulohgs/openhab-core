/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.core.semantics.model;

/**
 * This is the super interface for all types that represent an Point.
 * The interface describes the relations to other entity types.
 *
 * @author Kai Kreuzer - Initial contribution
 */
@TagInfo(id = "Point")
public interface Point extends Tag {

    Location hasLocation();

    Property relatesTo();
}
