/*
 *   Copyright 2020 Goldman Sachs.
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */

package com.gs.ep.docknight.model.attribute;

import com.gs.ep.docknight.model.Element;
import com.gs.ep.docknight.model.Length;
import com.gs.ep.docknight.model.LengthAttribute;

/**
 * This attribute represent the yth coordinate if we assume top left is the origin and yth
 * coordinate increases with downward direction.
 */
public class Top extends LengthAttribute {

  private static final long serialVersionUID = -2763649997371086926L;

  public Top(Length value) {
    this.setValue(value);
  }

  @Override
  public Class getHolderInterface() {
    return Holder.class;
  }

  public interface Holder<E extends Element> {

    default E add(Top attribute) {
      E element = (E) this;
      element.addAttribute(attribute);
      return element;
    }

    default Top getTop() {
      E element = (E) this;
      return element.getAttribute(Top.class);
    }
  }
}