call antlr .\src\PECL3Lexer.g4
call antlr .\src\PECL3Parser.g4
call javac -encoding utf8 .\src\*.java -d .\