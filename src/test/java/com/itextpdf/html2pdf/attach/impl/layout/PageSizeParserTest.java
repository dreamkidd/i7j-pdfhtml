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

import com.itextpdf.html2pdf.logs.Html2PdfLogMessageConstant;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.LogMessage;
import com.itextpdf.test.annotations.LogMessages;
import com.itextpdf.test.annotations.type.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(UnitTest.class)
public class PageSizeParserTest extends ExtendedITextTest {

    private static final double EPS = 1e-9;

    @Test
    public void simpleA4Test() {
        PageSize expected = PageSize.A4;
        PageSize actual = PageSizeParser.fetchPageSize("a4", 10, 10, PageSize.A0);
        assertSizesAreSame(expected, actual);
    }

    @Test
    public void simpleLedgerTest() {
        PageSize expected = PageSize.LEDGER.rotate();
        PageSize actual = PageSizeParser.fetchPageSize("ledger", 10, 10, PageSize.A0);
        assertSizesAreSame(expected, actual);
    }

    @Test
    public void ledgerLandscapeIsSameAsLedgerTest() {
        PageSize expected = PageSize.LEDGER;
        PageSize actual = PageSizeParser.fetchPageSize("ledger landscape", 10, 10, PageSize.A0);
        assertSizesAreSame(expected, actual);
    }

    @Test
    public void ledgerPortraitIsRotatedLedgerTest() {
        PageSize expected = PageSize.LEDGER.rotate();
        PageSize actual = PageSizeParser.fetchPageSize("ledger portrait", 10, 10, PageSize.A0);
        assertSizesAreSame(expected, actual);
    }

    @Test
    @LogMessages(messages = {@LogMessage(messageTemplate = Html2PdfLogMessageConstant.PAGE_SIZE_VALUE_IS_INVALID, count = 1),})
    public void incorrectPageSizeNameTest() {
        PageSize expected = PageSize.LEDGER;
        PageSize actual = PageSizeParser.fetchPageSize("INCORRECT_PAGE_SIZE", 10, 10, PageSize.LEDGER);
        assertSizesAreSame(expected, actual);
    }

    private void assertSizesAreSame(PageSize a, PageSize b) {
        Assert.assertEquals(a.getWidth(), b.getWidth(), EPS);
        Assert.assertEquals(a.getHeight(), b.getHeight(), EPS);
    }
}
