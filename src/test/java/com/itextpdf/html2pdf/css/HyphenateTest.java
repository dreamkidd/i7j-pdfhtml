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

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.utils.CompareTool;
import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.type.IntegrationTest;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class HyphenateTest extends ExtendedITextTest {
    private static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/css/HyphenateTest/";
    private static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/css/HyphenateTest/";

    @BeforeClass
    public static void beforeClass() {
        createDestinationFolder(destinationFolder);
    }

    @Test
    public void test01() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest01.html"), new File(destinationFolder + "hyphenateTest01.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest01.pdf", sourceFolder + "cmp_hyphenateTest01.pdf", destinationFolder, "diff01_"));
    }

    @Test
    public void test02() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest02.html"), new File(destinationFolder + "hyphenateTest02.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest02.pdf", sourceFolder + "cmp_hyphenateTest02.pdf", destinationFolder, "diff01_"));
    }

    @Test
    public void test03() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest03.html"), new File(destinationFolder + "hyphenateTest03.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest03.pdf", sourceFolder + "cmp_hyphenateTest03.pdf", destinationFolder, "diff03_"));
    }

    @Test
    public void test04() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest04.html"), new File(destinationFolder + "hyphenateTest04.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest04.pdf", sourceFolder + "cmp_hyphenateTest04.pdf", destinationFolder, "diff04_"));
    }

    @Test
    public void test05() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest05.html"), new File(destinationFolder + "hyphenateTest05.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest05.pdf", sourceFolder + "cmp_hyphenateTest05.pdf", destinationFolder, "diff05_"));
    }

    @Test
    public void test06() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest06.html"), new File(destinationFolder + "hyphenateTest06.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest06.pdf", sourceFolder + "cmp_hyphenateTest06.pdf", destinationFolder, "diff06_"));
    }

    @Test
    public void test07Ru() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest07Ru.html"), new File(destinationFolder + "hyphenateTest07Ru.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest07Ru.pdf", sourceFolder + "cmp_hyphenateTest07Ru.pdf", destinationFolder, "diff07Ru_"));
    }

    @Test
    public void test08De() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest08De.html"), new File(destinationFolder + "hyphenateTest08De.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest08De.pdf", sourceFolder + "cmp_hyphenateTest08De.pdf", destinationFolder, "diff08De_"));
    }

    @Test
    public void test09NonBreakingHyphen() throws IOException, InterruptedException {
        HtmlConverter.convertToPdf(new File(sourceFolder + "hyphenateTest09NonBreakingHyphen.html"), new File(destinationFolder + "hyphenateTest09NonBreakingHyphen.pdf"));
        Assert.assertNull(new CompareTool().compareByContent(destinationFolder + "hyphenateTest09NonBreakingHyphen.pdf", sourceFolder + "cmp_hyphenateTest09NonBreakingHyphen.pdf", destinationFolder, "diff09NonBreakingHyphen_"));
    }
}
