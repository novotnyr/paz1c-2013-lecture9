package sk.upjs.ics.paz1c.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import sk.upjs.ics.paz1c.text.Grep.ObsahujeDokumentPodmienka;
import sk.upjs.ics.paz1c.text.Grep.VzdyTruePodmienka;

public class GrepTest {
    private Grep grep;

    private File file;
    @Before
    public void setUp() {
        grep = new Grep();
        file = new File("markdown-demo-all.text");
    }
    
    @Test
    public void testContainsDocumentPodmienka() throws FileNotFoundException {
        GrepPodmienka podmienka = new ObsahujeDokumentPodmienka();
        List<String> riadky = grep.process(file, podmienka);
        List<String> expected = Arrays.asList(
                "\\documentclass{article}",
                "\\begin{document}",
                "\\end{document}");
        assertEquals(expected, riadky);
    }
    
    @Test
    public void testVzdyTruePodmienka() throws FileNotFoundException {
        GrepPodmienka podmienka = new VzdyTruePodmienka();
        List<String> riadky = grep.process(file, podmienka);
        List<String> expected = Arrays.asList(
                "\\documentclass{article}",
                "",
                "\\usepackage{url}",
                "",
                "\\begin{document}",
                "\\include{markdown-demo}",
                "\\end{document}");
        assertEquals(expected, riadky);
    }
}
