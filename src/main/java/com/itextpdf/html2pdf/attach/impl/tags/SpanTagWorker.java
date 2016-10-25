/*
    This file is part of the iText (R) project.
    Copyright (c) 1998-2017 iText Group NV
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
package com.itextpdf.html2pdf.attach.impl.tags;

import com.itextpdf.html2pdf.attach.ITagWorker;
import com.itextpdf.html2pdf.attach.ProcessorContext;
import com.itextpdf.html2pdf.attach.wrapelement.SpanWrapper;
import com.itextpdf.html2pdf.html.node.IElement;
import com.itextpdf.layout.IPropertyContainer;
import com.itextpdf.layout.element.ILeafElement;
import com.itextpdf.layout.element.Text;
import java.util.ArrayList;
import java.util.List;

public class SpanTagWorker implements ITagWorker {

    private SpanWrapper spanWrapper;
    private List<ILeafElement> leafElements;
    private List<ILeafElement> ownLeafElements = new ArrayList<>();

    public SpanTagWorker(IElement element, ProcessorContext context) {
        spanWrapper = new SpanWrapper();
    }

    @Override
    public void processEnd(IElement element, ProcessorContext context) {
        leafElements = spanWrapper.getLeafElements();
    }

    @Override
    public boolean processContent(String content, ProcessorContext context) {
        Text text = new Text(content);
        spanWrapper.add(text);
        ownLeafElements.add(text);
        return true;
    }

    @Override
    public boolean processTagChild(ITagWorker childTagWorker, ProcessorContext context) {
        IPropertyContainer element = childTagWorker.getElementResult();
        if (element instanceof ILeafElement) {
            spanWrapper.add((ILeafElement) element);
            ownLeafElements.add((ILeafElement) element);
            return true;
        } else if (childTagWorker instanceof SpanTagWorker) {
            spanWrapper.add(((SpanTagWorker) childTagWorker).spanWrapper);
            return true;
        }

        return false;
    }

    public List<ILeafElement> getAllLeafElements() {
        return leafElements;
    }

    public List<ILeafElement> getOwnLeafElements() {
        return ownLeafElements;
    }

    @Override
    public IPropertyContainer getElementResult() {
        return null;
    }

}