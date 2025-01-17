/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2021 iText Group NV
    Authors: Bruno Lowagie, Paulo Soares, et al.
    
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License version 3
    as published by the Free Software Foundation with the addition of the
    following permission added to Section 15 as permitted in Section 7(a):
    FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY
    ITEXT GROUP. ITEXT GROUP DISCLAIMS THE WARRANTY OF NON INFRINGEMENT
    OF THIRD PARTY RIGHTS
    
    This program is distributed in the hope that it will be useful, but
    WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
    or FITNESS FOR A PARTICULAR PURPOSE.
    See the GNU Affero General Public License for more details.
    You should have received a copy of the GNU Affero General Public License
    along with this program; if not, see http://www.gnu.org/licenses or write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA, 02110-1301 USA, or download the license from the following URL:
    http://itextpdf.com/terms-of-use/
    
    The interactive user interfaces in modified source and object code versions
    of this program must display Appropriate Legal Notices, as required under
    Section 5 of the GNU Affero General Public License.
    
    In accordance with Section 7(b) of the GNU Affero General Public License,
    a covered work must retain the producer line in every PDF that is created
    or manipulated using iText.
    
    You can be released from the requirements of the license by purchasing
    a commercial license. Buying such a license is mandatory as soon as you
    develop commercial activities involving the iText software without
    disclosing the source code of your own applications.
    These activities include: offering paid services to customers as an ASP,
    serving PDFs on the fly in a web application, shipping iText with a closed
    source product.
    
    For more information, please contact iText Software Corp. at this
    address: sales@itextpdf.com
 */
package com.itextpdf.html2pdf.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that allows to map keys (html tags, css attributes) to the
 * corresponding tag processors (a tag worker or a CSS applier).
 */
public class TagProcessorMapping<T> {

    /** The default display key. */
    private static String DEFAULT_DISPLAY_KEY = "defaultKey";

    /** The actual mapping. */
    private Map<String, Map<String, T>> mapping;

    /**
     * Creates a new {@link TagProcessorMapping} instance.
     */
    public TagProcessorMapping() {
        mapping = new HashMap<>();
    }

    /**
     * Add a new tag to the map.
     *
     * @param tag the key
     * @param mapping the class instance that maps to the tag
     */
    public void putMapping(String tag, T mapping) {
        ensureMappingExists(tag).put(DEFAULT_DISPLAY_KEY, mapping);
    }

    /**
     * Add a new tag to the map.
     *
     * @param tag the key
     * @param display the display value
     * @param mapping the class instance that maps to the tag
     */
    public void putMapping(String tag, String display, T mapping) {
        ensureMappingExists(tag).put(display, mapping);
    }

    /**
     * Gets the class that maps to a specific tag.
     *
     * @param tag the key
     * @return the class that maps to the tag
     */
    public Object getMapping(String tag) {
        return getMapping(tag, DEFAULT_DISPLAY_KEY);
    }

    /**
     * Gets the class that maps to a specific tag.
     *
     * @param tag the key
     * @param display the display value
     * @return the class that maps to the tag
     */
    public Object getMapping(String tag, String display) {
        Map<String, T> tagMapping = mapping.get(tag);
        if (tagMapping == null) {
            return null;
        } else {
            return tagMapping.get(display);
        }
    }

    /**
     * Ensure that a mapping for a specific key exists.
     *
     * @param tag the key
     * @return the map
     */
    private Map<String, T> ensureMappingExists(String tag) {
        if (mapping.containsKey(tag)) {
            return mapping.get(tag);
        } else {
            Map<String, T> tagMapping = new HashMap<>();
            mapping.put(tag, tagMapping);
            return tagMapping;
        }
    }

}
