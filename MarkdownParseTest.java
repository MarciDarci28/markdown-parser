import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testfile() throws IOException {
        assertEquals(List.of("https://something.com", "some-thing.html")
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void test2() throws IOException {
        assertEquals(List.of("something.com")
        ,MarkdownParse.getLinks(Files.readString(Path.of("test2.md"))));
    }

    @Test
    public void test3() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test3.md"))));
    }

    @Test
    public void test4() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test4.md"))));
    }

    @Test
    public void testfile2() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html")
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file2.md"))));
    }

    @Test
    public void testfile3() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file3.md"))));
    }

    @Test
    public void testfile4() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file4.md"))));
    }

    @Test
    public void testfile5() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }

    @Test
    public void testfile6() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file6.md"))));
    }

    public void testfile7() throws IOException {
        assertEquals(List.of()
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file7.md"))));
    }

    public void testfile8() throws IOException {
        assertEquals(List.of("a link on the first line")
        ,MarkdownParse.getLinks(Files.readString(Path.of("test-file8.md"))));
    }

    @Test
    public void test_snippet1() throws IOException {
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu")
        ,MarkdownParse.getLinks(Files.readString(Path.of("Snippet1.md"))));
    }
    
    @Test
    public void test_snippet2() throws IOException {
        assertEquals(List.of("a.com", "a.com(())", "example.com")
        ,MarkdownParse.getLinks(Files.readString(Path.of("Snippet2.md"))));
    }

    @Test
    public void test_snippet3() throws IOException {
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule")
        ,MarkdownParse.getLinks(Files.readString(Path.of("Snippet3.md"))));
    }
}
