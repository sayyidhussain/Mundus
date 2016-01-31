/*
 * Copyright (c) 2016. See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mbrlabs.mundus.core.kryo.descriptors;

import com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;

/**
 * @author Marcus Brummer
 * @version 31-01-2016
 */
public class TerrainTextureDescriptor {

    @Tag(0)
    private Long textureChanR;
    @Tag(1)
    private Long textureChanG;
    @Tag(2)
    private Long textureChanB;
    @Tag(3)
    private Long textureChanA;
    @Tag(4)
    private String splatmapPath;

    public Long getTextureChanR() {
        return textureChanR;
    }

    public void setTextureChanR(long textureChanR) {
        this.textureChanR = textureChanR;
    }

    public Long getTextureChanG() {
        return textureChanG;
    }

    public void setTextureChanG(long textureChanG) {
        this.textureChanG = textureChanG;
    }

    public Long getTextureChanB() {
        return textureChanB;
    }

    public void setTextureChanB(long textureChanB) {
        this.textureChanB = textureChanB;
    }

    public Long getTextureChanA() {
        return textureChanA;
    }

    public void setTextureChanA(long textureChanA) {
        this.textureChanA = textureChanA;
    }

    public String getSplatmapPath() {
        return splatmapPath;
    }

    public void setSplatmapPath(String splatmapPath) {
        this.splatmapPath = splatmapPath;
    }

    @Override
    public String toString() {
        return "TerrainTextureDescriptor{" +
                "textureChanR=" + textureChanR +
                ", textureChanG=" + textureChanG +
                ", textureChanB=" + textureChanB +
                ", textureChanA=" + textureChanA +
                ", splatmapPath='" + splatmapPath + '\'' +
                '}';
    }
}
