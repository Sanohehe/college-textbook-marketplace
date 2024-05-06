package cs4370.unibooks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return """
            <html>
                <head>
                    <title>Welcome to UniBooks</title>
                </head>
                <body>
                    <h1>Welcome to UniBooks</h1>
                    <p>Explore the following pages:</p>
                    <ul>
                        <li><a href="/courses">Courses</a></li>
                        <li><a href="/books">Textbooks</a></li>
                        <li><a href="/transactions">Transactions</a></li>
                        <li><a href="/users">Users</a></li>
                    </ul>
                </body>
            </html>
            """;
    }
}
