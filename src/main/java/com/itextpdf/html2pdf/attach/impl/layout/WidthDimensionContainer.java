/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2021 iText Group NV
    Authors: iText Software.

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
package com.itextpdf.html2pdf.attach.impl.layout;

import com.itextpdf.html2pdf.css.CssConstants;
import com.itextpdf.layout.minmaxwidth.MinMaxWidth;
import com.itextpdf.layout.renderer.BlockRenderer;
import com.itextpdf.layout.renderer.IRenderer;
import com.itextpdf.styledxmlparser.css.CssContextNode;

class WidthDimensionContainer extends DimensionContainer {

    public WidthDimensionContainer(CssContextNode node, float maxWidth, IRenderer renderer, float additionalWidthFix) {
        String width = node.getStyles().get(CssConstants.WIDTH);
        if (width != null && !CssConstants.AUTO.equals(width)) {
            dimension = parseDimension(node, width, maxWidth, additionalWidthFix);
        }
        minDimension = getMinWidth(node, maxWidth, additionalWidthFix);
        maxDimension = getMaxWidth(node, maxWidth, additionalWidthFix);

        if (!isAutoDimension()) {

            // According to point 3 of paragraph "5.3.2.3. Handling min-width and max-width" of the specification
            // maxContentDimension and minContentDimension will always be equal
            maxContentDimension = dimension;
            minContentDimension = dimension;
        } else if (renderer instanceof BlockRenderer) {
            MinMaxWidth minMaxWidth = ((BlockRenderer) renderer).getMinMaxWidth();
            maxContentDimension = minMaxWidth.getMaxWidth();
            minContentDimension = minMaxWidth.getMinWidth();
        }
    }

    private float getMinWidth(CssContextNode node, float maxAvailableWidth, float additionalWidthFix) {
        String content = node.getStyles().get(CssConstants.MIN_WIDTH);
        if (content == null) {
            return 0;
        }
        return parseDimension(node, content, maxAvailableWidth, additionalWidthFix);
    }

    private float getMaxWidth(CssContextNode node, float maxAvailableWidth, float additionalWidthFix) {
        String content = node.getStyles().get(CssConstants.MAX_WIDTH);
        if (content == null) {
            return Float.MAX_VALUE;
        }
        float dim = parseDimension(node, content, maxAvailableWidth, additionalWidthFix);
        if (dim == 0) {
            return Float.MAX_VALUE;
        }
        return dim;
    }

}
