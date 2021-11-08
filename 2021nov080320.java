class Main {
    public static void main(String[] args) {
        // put your code here
    }
}


// Html Parser
// Some info: HTML is a markup language, that is based on tags. There are many types of tags, for example, html, div, h1, h2.
// Each type of tag has start <tagName> and end </tagName>notations, for example <div> and </div>.
// This pair may hold text content or children tags:

// <div>
//   <h1>text</h1>
// </div>
// You may learn more on the wiki.

// Task: Today you will create your own HTML parser! It should print the content for each pair of tags.

// There are two rules for printing order:

// the same hierarchy level tags are processed left to right;
// if a tag has other tags as children, children should be processed first. If there are no children or all of them were processed already, the tag can be processed.
// Let's see how it works and why:

// 1. First example input: <html>content</html>

// Output: content

// Explanation: There is a single pair of html tag, its content is "content".

// 2. More complicated input:

// <html>
//   <h1>content1</h1>
//   <h2>content2</h2>
// </html>
// Output:

// content1
// content2
// <h1>content1</h1><h2>content2</h2>

// Explanation: There are 3 pairs of tags: html, h1 and h2. h1 and h2 are preferred by rule 2 because they are children of html.
// h1 goes before h2 by rule 1.

// 3. And the hardest one so far input:

// <html>
//   <h1>content1</h1>
//   <div>
//     <h2>content2</h2>
//   </div>
// </html>
// Output:

// content1
// content2
// <h2>content2</h2>
// <h1>content1</h1><div><h2>content2</h2></div>

// See this one's explanation in the hint, if needed.

// Hint


// Sample Input:
// <html><a>hello</a><h1><h4>nestedHello</h4><h3>nestedWorld</h3><h6><br>top</br></h6></h1><br>world</br></html>

// Sample Output:
// hello
// nestedHello
// nestedWorld
// top
// <br>top</br>
// <h4>nestedHello</h4><h3>nestedWorld</h3><h6><br>top</br></h6>
// world
// <a>hello</a><h1><h4>nestedHello</h4><h3>nestedWorld</h3><h6><br>top</br></h6></h1><br>world</br>



// Memory limit: 256 MB
// Time limit: 8 seconds
