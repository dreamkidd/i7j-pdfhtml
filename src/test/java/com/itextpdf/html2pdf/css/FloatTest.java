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

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.io.util.UrlUtil;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.utils.CompareTool;
import com.itextpdf.styledxmlparser.css.media.MediaDeviceDescription;
import com.itextpdf.styledxmlparser.css.media.MediaType;
import com.itextpdf.styledxmlparser.css.util.CssDimensionParsingUtils;
import com.itextpdf.test.ExtendedITextTest;
import com.itextpdf.test.annotations.type.IntegrationTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class FloatTest extends ExtendedITextTest {

    public static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/css/FloatTest/";
    public static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/css/FloatTest/";

    @BeforeClass
    public static void beforeClass() {
        createOrClearDestinationFolder(destinationFolder);
    }

    @Test
    public void float01Test() throws IOException, InterruptedException {
        runTest("float01Test", "diff01_");
    }

    @Test
    public void float02Test() throws IOException, InterruptedException {
        runTest("float02Test", "diff02_");
    }

    @Test
    public void float03Test() throws IOException, InterruptedException {
        runTest("float03Test", "diff03_");
    }

    @Test
    public void float04Test() throws IOException, InterruptedException {
        runTest("float04Test", "diff04_");
    }

    @Test
    public void float05Test() throws IOException, InterruptedException {
        runTest("float05Test", "diff05_");
    }

    @Test
    public void float06Test() throws IOException, InterruptedException {
        runTest("float06Test", "diff07_");
    }

    @Test
    public void float07Test() throws IOException, InterruptedException {
        runTest("float07Test", "diff08_");
    }

    @Test
    public void float08Test() throws IOException, InterruptedException {
        runTest("float08Test", "diff27_");
    }

    @Test
    public void float09Test() throws IOException, InterruptedException {
        runTest("float09Test", "diff09_");
    }

    @Test
    public void float10Test() throws IOException, InterruptedException {
        runTest("float10Test", "diff10_");
    }

    @Test
    public void float11Test() throws IOException, InterruptedException {
        runTest("float11Test", "diff11_");
    }

    @Test
    public void float12Test() throws IOException, InterruptedException {
        runTest("float12Test", "diff12_");
    }

    @Test
    public void float13Test() throws IOException, InterruptedException {
        runTest("float13Test", "diff13_");
    }

    @Test
    public void float14Test() throws IOException, InterruptedException {
        runTest("float14Test", "diff14_");
    }

    @Test
    public void float15Test() throws IOException, InterruptedException {
        runTest("float15Test", "diff15_");
    }

    @Test
    public void float16Test() throws IOException, InterruptedException {
        // TODO DEVSIX-1730: at the moment we always wrap inline text in paragraphs, thus when we process next floating element it's always on next line
        // see also float50Test and float51Test
        runTest("float16Test", "diff16_");
    }

    @Test
    public void float17Test() throws IOException, InterruptedException {
        runTest("float17Test", "diff17_");
    }

    @Test
    public void floatRightClearRightInTableTest() throws IOException, InterruptedException {
        runTest("floatRightClearRightInTable", "diff18_");
    }

    @Test
    public void float19Test() throws IOException, InterruptedException {
        runTest("float19Test", "diff19_");
    }

    @Test
    public void float20Test() throws IOException, InterruptedException {
        runTest("float20Test", "diff20_");
    }

    @Test
    public void float21Test() throws IOException, InterruptedException {
        runTest("float21Test", "diff21_");
    }

    @Test
    public void float22Test() throws IOException, InterruptedException {
        runTest("float22Test", "diff22_");
    }

    @Test
    public void float23Test() throws IOException, InterruptedException {
        runTest("float23Test", "diff23_");
    }

    @Test
    public void float24Test() throws IOException, InterruptedException {
        runTest("float24Test", "diff24_");
    }

    @Test
    public void float25Test() throws IOException, InterruptedException {
        // TODO DEVSIX-1730: at the moment we always wrap inline text in paragraphs, thus when we process next floating element it's always on next line
        // see also float50Test and float51Test
        runTest("float25Test", "diff25_");
    }

    @Test
    public void float26Test() throws IOException, InterruptedException {
        runTest("float26Test", "diff26_");
    }

    @Test
    public void float27Test() throws IOException, InterruptedException {
        runTest("float27Test", "diff27_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float28Test() throws IOException, InterruptedException {
        runTest("float28Test", "diff28_");
    }

    @Test
    public void float29Test() throws IOException, InterruptedException {
        runTest("float29Test", "diff29_");
    }

    @Test
    // TODO DEVSIX-1269 and DEVSIX-1270 update cmp file after fixing
    public void float30Test() throws IOException, InterruptedException {
        runTest("float30Test", "diff30_");
    }

    @Test
    // TODO DEVSIX-1269 and DEVSIX-1270 update cmp file after fixing
    public void float31Test() throws IOException, InterruptedException {
        runTest("float31Test", "diff31_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float32Test() throws IOException, InterruptedException {
        runTest("float32Test", "diff32_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float33Test() throws IOException, InterruptedException {
        runTest("float33Test", "diff33_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float34Test() throws IOException, InterruptedException {
        runTest("float34Test", "diff34_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float35Test() throws IOException, InterruptedException {
        runTest("float35Test", "diff35_");
    }

    @Test
    public void float36Test() throws IOException, InterruptedException {
        // TODO DEVSIX-1730: at the moment we always wrap inline text in paragraphs, thus when we process next floating element it's always on next line
        // see also float50Test and float51Test
        runTest("float36Test", "diff36_");
    }

    @Test
    public void float37Test() throws IOException, InterruptedException {
        runTest("float37Test", "diff37_");
    }

    @Test
    public void float38Test() throws IOException, InterruptedException {
        runTest("float38Test", "diff38_");
    }

    @Test
    // TODO DEVSIX-1270, DEVSIX-1269
    public void float39Test() throws IOException, InterruptedException {
        runTest("float39Test", "diff39_");
    }

    @Test
    // TODO DEVSIX-1269 update cmp file after fixing
    public void float40Test() throws IOException, InterruptedException {
        runTest("float40Test", "diff40_");
    }

    @Test
    public void float41Test() throws IOException, InterruptedException {
        runTest("float41Test", "diff41_");
    }

    @Test
    public void float42Test() throws IOException, InterruptedException {
        runTest("float42Test", "diff42_");
    }

    @Test
    public void float43Test() throws IOException, InterruptedException {
        runTest("float43Test", "diff43_");
    }

    @Test
    public void float44Test() throws IOException, InterruptedException {
        runTest("float44Test", "diff44_");
    }

    @Test
    public void float45Test() throws IOException, InterruptedException {
        runTest("float45Test", "diff45_");
    }

    @Test
    public void float46Test() throws IOException, InterruptedException {
        runTest("float46Test", "diff46_");
    }

    @Test
    public void float47Test() throws IOException, InterruptedException {
        runTest("float47Test", "diff47_");
    }

    @Test
    public void float48Test() throws IOException, InterruptedException {
        runTest("float48Test", "diff48_");
    }

    @Test
    public void float49Test() throws IOException, InterruptedException {
        runTest("float49Test", "diff49_");
    }

    @Test
    public void float50Test() throws IOException, InterruptedException {
        // TODO DEVSIX-1730: at the moment we always wrap inline text in paragraphs, thus we process this test exactly like in float51Test
        runTest("float50Test", "diff50_");
    }

    @Test
    public void float51Test() throws IOException, InterruptedException {
        runTest("float51Test", "diff51_");
    }

    @Test
    public void floatLeftInNestedDivTest() throws IOException, InterruptedException {
        // TODO: DEVSIX-1372 content of floating div is NOT below parent content top edge.
        // This happens when parent's margin gets bigger from collapsing with it's first kid.
        runTest("floatLeftInNestedDiv", "diff52_");
    }

    @Test
    public void floatedLeftDivTest() throws IOException, InterruptedException {
        // TODO: DEVSIX-1372 both floating and first non-floating element are direct kids of the <body> tag.
        // It seems that in html there is some kind of root block, and it's
        // top margin and first kid's top-margin are collapsing. This is different from iText layout mechanism.
        runTest("floatedLeftDiv", "diff53_");
    }

    @Test
    public void float54Test() throws IOException, InterruptedException {
        runTest("float54Test", "diff54_");
    }

    @Test
    public void float55Test() throws IOException, InterruptedException {
        runTest("float55Test", "diff55_");
    }

    @Test
    public void floatedRightNestedDivTest() throws IOException, InterruptedException {
        runTest("floatedRightNestedDiv", "diff56_");
    }

    @Test
    public void float57Test() throws IOException, InterruptedException {
        runTest("float57Test", "diff57_");
    }

    @Test
    public void float58Test() throws IOException, InterruptedException {
        // TODO: DEVSIX-1372
        runTest("float58Test", "diff58_");
    }

    @Test
    public void floatedDivsPlacingTest() throws IOException, InterruptedException {
        runTest("floatedDivsPlacing", "diff59_");
    }

   @Test
    public void float60Test() throws IOException, InterruptedException {
        runTest("float60Test", "diff60_");
    }

    @Test
    public void float61Test() throws IOException, InterruptedException {
        runTest("float61Test", "diff61_");
    }

    @Test
    public void floatPropertyInListTest() throws IOException, InterruptedException {
        runTest("floatPropertyInListTest", "diff62_");
    }

    @Test
    public void floatLeftDisplayInlineBlockInListTest() throws IOException, InterruptedException {
        runTest("floatLeftDisplayInlineBlockInList", "diff63_");
    }

    @Test
    public void floatLeftInListsNestedInDivsTest() throws IOException, InterruptedException {
        runTest("floatLeftInListsNestedInDivs", "diff64_");
    }

    @Test
    public void floatedLeftParagraphsInFloatedRightDivsTest() throws IOException, InterruptedException {
        runTest("floatedLeftParagraphsInFloatedRightDivs", "diff65_");
    }

    @Test
    public void float66Test() throws IOException, InterruptedException {
        runTest("float66Test", "diff66_");
    }

    @Test
    public void float67Test() throws IOException, InterruptedException {
        runTest("float67Test", "diff67_");
    }

    @Test
    public void diffFloatValueInPInsideFloatedRightDivTest() throws IOException, InterruptedException {
        runTest("diffFloatValueInPInsideFloatedRightDiv", "diff68_");
    }

    @Test
    public void diffFloatValuesInListsTest() throws IOException, InterruptedException {
        runTest("diffFloatValuesInLists", "diff69_");
    }

    @Test
    public void displayInlineBlockPInsideFloatedDivTest() throws IOException, InterruptedException {
        runTest("displayInlineBlockPInsideFloatedDiv", "diff70_");
    }

    @Test
    public void floatAndTables01Test() throws IOException, InterruptedException {
        runTest("floatAndTables01Test", "diffTables01_");
    }

    @Test
    public void floatAndTables02Test() throws IOException, InterruptedException {
        runTest("floatAndTables02Test", "diffTables02_");
    }

    @Test
    public void floatAndTables03Test() throws IOException, InterruptedException {
        runTest("floatAndTables03Test", "diffTables03_");
    }

    @Test
    public void floatAndTables04Test() throws IOException, InterruptedException {
        runTest("floatAndTables04Test", "diffTables04_");
    }

    @Test
    public void floatAndTables05Test() throws IOException, InterruptedException {
        runTest("floatAndTables05Test", "diffTables05_");
    }

    @Test
    public void floatAndTables06Test() throws IOException, InterruptedException {
        runTest("floatAndTables06Test", "diffTables06_");
    }

    @Test
    public void floatAndTables07Test() throws IOException, InterruptedException {
        runTest("floatAndTables07Test", "diffTables07_");
    }

    @Test
    public void floatAndTables08Test() throws IOException, InterruptedException {
        runTest("floatAndTables08Test", "diffTables08_");
    }

    @Test
    public void floatAndTables09Test() throws IOException, InterruptedException {
        runTest("floatAndTables09Test", "diffTables09_");
    }

    @Test
    public void floatAndTables10Test() throws IOException, InterruptedException {
        runTest("floatAndTables10Test", "diffTables10_");
    }

    @Test
    public void floatLeftImageTest() throws IOException, InterruptedException {
        runTest("floatLeftImage", "diffImages01_");
    }

    @Test
    public void floatRightImageTest() throws IOException, InterruptedException {
        runTest("floatRightImage", "diffImages02_");
    }

    @Test
    public void floatedImagesAmongParagraphsTest() throws IOException, InterruptedException {
        runTest("floatedImagesAmongParagraphs", "diffImages03_");
    }

    @Test
    public void severalFloatedImagesAmongParagraphsTest() throws IOException, InterruptedException {
        runTest("severalFloatedImagesAmongParagraphs", "diffImages04_");
    }

    @Test
    public void floatedLeftImageInParagraphTest() throws IOException, InterruptedException {
        runTest("floatedLeftImageInParagraph", "diffImages05_");
    }

    @Test
    public void floatedImagesInDivTest() throws IOException, InterruptedException {
        runTest("floatedImagesInDiv", "diffImages06_");
    }

    @Test
    public void nestedFloatedImagesWithDisplayBlockTest() throws IOException, InterruptedException {
        runTest("nestedFloatedImagesWithDisplayBlock", "diffImages07_");
    }

    @Test
    public void nestedFloatedImagesTest() throws IOException, InterruptedException {
        runTest("nestedFloatedImages", "diffImages08_");
    }

    @Test
    public void severalNestedFloatedImagesTest() throws IOException, InterruptedException {
        runTest("severalNestedFloatedImages", "diffImages09_");
    }

    @Test
    public void floatedImageInsideLongTextTest() throws IOException, InterruptedException {
        runTest("floatedImageInsideLongText", "diffImages10_");
    }

    @Test
    public void longTextAfterFloatedImageTest() throws IOException, InterruptedException {
        runTest("longTextAfterFloatedImage", "diffImages11_");
    }

    @Test
    public void nestedFloatedImagesInsideLongTextTest() throws IOException, InterruptedException {
        runTest("nestedFloatedImagesInsideLongText", "diffImages12_");
    }

    @Test
    public void floatedImagesWithTextInNarrowDivTest() throws IOException, InterruptedException {
        runTest("floatedImagesWithTextInNarrowDiv", "diffImages13_");
    }

    @Test
    //TODO: DEVSIX-1316 update cmp file after fixing
    public void floatImage14Test() throws IOException, InterruptedException {
        runTest("floatImage14Test", "diffImages14_");
    }

    @Test
    public void floatLeftInSpanTest() throws IOException, InterruptedException {
        runTest("floatLeftInSpan", "diffInline01_");
    }

    @Test
    public void floatSpanInNarrowPTest() throws IOException, InterruptedException {
        runTest("floatSpanInNarrowP", "diffInline02_");
    }

    @Test
    public void floatSpanInWidePTest() throws IOException, InterruptedException {
        runTest("floatSpanInWideP", "diffInline03_");
    }

    @Test
    public void floatSpanNestedInFloatDivTest() throws IOException, InterruptedException {
        runTest("floatSpanNestedInFloatDiv", "diffInline04_");
    }

    @Test
    public void floatSpanNestedInBlockElementsOfDiffWidth01Test() throws IOException, InterruptedException {
        runTest("floatSpanNestedInBlockElementsOfDiffWidth01", "diffInline05_");
    }

    @Test
    public void floatSpanNestedInBlockElementsOfDiffWidth02Test() throws IOException, InterruptedException {
        runTest("floatSpanNestedInBlockElementsOfDiffWidth02", "diffInline06_");
    }

    @Test
    public void floatSpanNestedInBlockElementsOfDiffWidth03Test() throws IOException, InterruptedException {
        runTest("floatSpanNestedInBlockElementsOfDiffWidth03", "diffInline07_");
    }

    @Test
    public void floatRightSpanInParagraphTest() throws IOException, InterruptedException {
        runTest("floatRightSpanInParagraph", "diffInline08_");
    }

    @Test
    public void floatInline09Test() throws IOException, InterruptedException {
        // TODO DEVSIX-1269
        runTest("floatInline09Test", "diffImages09_");
    }

    @Test
    public void floatImgInParagraphWIthMarginTest() throws IOException, InterruptedException {
        runTest("floatImgInParagraphWIthMargin", "diffInline10_");
    }

    @Test
    public void nestedFloatedSpansInParagraphTest() throws IOException, InterruptedException {
        runTest("nestedFloatedSpansInParagraph", "diffInline11_");
    }

    @Test
    public void floatSpanInNonFloatedParagraphTest() throws IOException, InterruptedException {
        runTest("floatSpanInNonFloatedParagraph", "diffInline12_");
    }

    @Test
    public void floatSpanInNonFloatedParagraphLongTextTest() throws IOException, InterruptedException {
        runTest("floatSpanInNonFloatedParagraphLongText", "diffInline13_");
    }

    @Test
    public void nestedFloatedSpansTest() throws IOException, InterruptedException {
        runTest("nestedFloatedSpans", "diffInline14_");
    }

    @Test
    public void nestedSpansWithDiffFloatCombinationTest() throws IOException, InterruptedException {
        runTest("nestedSpansWithDiffFloatCombination", "diffInline15_");
    }

    @Test
    public void floatSpanNestedInBlockElementsOfDiffWidth04Test() throws IOException, InterruptedException {
        runTest("floatSpanNestedInBlockElementsOfDiffWidth04", "diffInline16_");
    }

    @Test
    public void floatInline17Test() throws IOException, InterruptedException {
        runTest("floatInline17Test", "diffImages17_");
    }

    @Test
    public void floatFixedWidthOverflow01Test() throws IOException, InterruptedException {
        runTest("floatFixedWidthOverflow01Test", "diffWidthOverflow01_");
    }

    @Test
    public void floatFixedWidthOverflow02Test() throws IOException, InterruptedException {
        runTest("floatFixedWidthOverflow02Test", "diffWidthOverflow02_");
    }

    @Test
    public void floatContentOverflow01Test() throws IOException, InterruptedException {
        runTest("floatContentOverflow01Test", "diffContentOverflow01_");
    }

    @Test
    public void floatFixedWidthNested01Test() throws IOException, InterruptedException {
        runTest("floatFixedWidthNested01Test", "diffWidthOverflowNested01_");
    }

    @Test
    public void nestedFloat01Test() throws IOException, InterruptedException {
        runTest("nestedFloat01Test", "diffNested01_");
    }

    @Test
    // TODO fix cmp file after DEVSIX-1933
    public void floatImageTableTest() throws IOException, InterruptedException {
        runTest("floatImageTableTest", "diffFloatImageTableTest_");
    }

    @Test
    //TODO Test file to be updated in DEVSIX-2231
    public void newPageFloatTest() throws IOException, InterruptedException {
        runTest("newPageFloatTest", "diff_newPageFloat_");
    }

    @Test
    //TODO This test should fail after the fix in DEVSIX-2335
    public void floatingDivBottomBorderTest() throws IOException, InterruptedException {
        runTest("floatingDivBottomBorderTest", "diff_BottomBorderTest_");
    }

   @Test
    public void floatCaption01Test() throws IOException, InterruptedException {
        runTest("floatCaption01Test", "diff_floatCaption01Test_");
    }

    @Test
    public void plainTextIndentAfterBlockAndFloatTest() throws IOException, InterruptedException {
        runTest("plainTextIndentAfterBlockAndFloat", "diff_plainTextIndentAfterBlockAndFloat_");
    }

    @Test
    //TODO DEVSIX-5291 change cmp file
    public void floatElementInDivTest() throws IOException, InterruptedException {
        runTest("floatElementInDiv", "diff_floatElementInDiv_");
    }

    private void runTest(String testName, String diff) throws IOException, InterruptedException {
        String htmlName = sourceFolder + testName + ".html";
        String outFileName = destinationFolder + testName + ".pdf";
        String cmpFileName = sourceFolder + "cmp_" + testName + ".pdf";
        HtmlConverter.convertToPdf(new File(htmlName), new File(outFileName));
        System.out.println("html: " + UrlUtil.getNormalizedFileUriString(htmlName) + "\n");
        Assert.assertNull(new CompareTool().compareByContent(outFileName, cmpFileName, destinationFolder, diff));
    }

    @Test
    public void responsiveIText() throws IOException, InterruptedException {
        PageSize[] pageSizes = {
                null,
                new PageSize(PageSize.A3.getHeight(), PageSize.A4.getHeight()),
                new PageSize(760,PageSize.A4.getHeight()),
                new PageSize(PageSize.A5.getWidth(), PageSize.A4.getHeight())
        };

        String htmlSource = sourceFolder + "responsiveIText.html";

        for (PageSize pageSize : pageSizes) {
            Float pxWidth = null;
            if (pageSize != null) {
                pxWidth = CssDimensionParsingUtils.parseAbsoluteLength(String.valueOf(pageSize.getWidth()));
            }
            String outName = "responsiveIText" + (pxWidth != null ? "_" + (int)(float)pxWidth : "") + ".pdf";
            PdfWriter writer = new PdfWriter(destinationFolder + outName);
            PdfDocument pdfDoc = new PdfDocument(writer);
            ConverterProperties converterProperties = new ConverterProperties();
            if (pageSize != null) {
                pdfDoc.setDefaultPageSize(pageSize);
                MediaDeviceDescription mediaDescription = new MediaDeviceDescription(MediaType.SCREEN);
                mediaDescription.setWidth((float)pxWidth);
                converterProperties.setMediaDeviceDescription(mediaDescription);
            }
            try (FileInputStream fileInputStream = new FileInputStream(htmlSource)) {
                HtmlConverter.convertToPdf(fileInputStream, pdfDoc, converterProperties);
            }
            pdfDoc.close();
        }

        for (PageSize pageSize : pageSizes) {
            Float pxWidth = null;
            if (pageSize != null) {
                pxWidth = CssDimensionParsingUtils.parseAbsoluteLength(String.valueOf(pageSize.getWidth()));
            }
            String outName = "responsiveIText" + (pxWidth != null ? "_" + (int)(float)pxWidth : "") + ".pdf";
            String cmpName = "cmp_" + outName;

            Assert.assertNull(new CompareTool().compareByContent(destinationFolder + outName, sourceFolder + cmpName, destinationFolder, "diffResponsive_"));
        }
    }
}
