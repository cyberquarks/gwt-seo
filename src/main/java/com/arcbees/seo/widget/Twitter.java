/**
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.arcbees.seo.widget;

public class Twitter extends ContainerNode {
    private TwitterCardType cardType;
    private TwitterSite site;

    public void add(TwitterCardType cardType) {
        this.cardType = cardType;
    }

    public void add(TwitterSite site) {
        this.site = site;
    }

    public TwitterCardType getCardType() {
        return cardType;
    }

    public TwitterSite getSite() {
        return site;
    }
}