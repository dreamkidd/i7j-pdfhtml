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
package com.itextpdf.html2pdf.css;

import com.itextpdf.html2pdf.ExtendedHtmlConversionITextTest;
import com.itextpdf.test.annotations.type.IntegrationTest;

import java.io.IOException;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class CssOpacityTest extends ExtendedHtmlConversionITextTest {
    public static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/css/CssOpacityTest/";
    public static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/css/CssOpacityTest/";

    @BeforeClass
    public static void beforeClass() {
        createOrClearDestinationFolder(destinationFolder);
    }

    @Test
    //TODO: DEVSIX-4679 invalid processing of opacity in kid elements
    public void innerOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("innerOpacityTest", sourceFolder, destinationFolder);
    }

    @Test
    public void nestedInSpanTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("nestedInSpanTest", sourceFolder, destinationFolder);
    }

    @Test
    public void spanOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("spanOpacity", sourceFolder, destinationFolder);
    }

    @Test
    public void imageOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("imageOpacity", sourceFolder, destinationFolder);
    }

    @Test
    public void pOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("pOpacity", sourceFolder, destinationFolder);
    }

    @Test
    public void divOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("divOpacity", sourceFolder, destinationFolder);
    }

    @Test
    public void tableOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("tableOpacity", sourceFolder, destinationFolder);
    }

    @Test
    public void opacityInListsTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("opacityInLists", sourceFolder, destinationFolder);
    }

    @Test
    public void innerDivOpacityTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("innerDivOpacity", sourceFolder, destinationFolder);
    }
}
