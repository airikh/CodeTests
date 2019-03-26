# SignalPath, LLC.
## Platform Engineering Code Assessment
1. Rank each of the following languages and frameworks on a 4 point scale, where 1 = "I've been paid to write production quality code with it." and 4 = "I could write a Hello World web application if I had a tutorial."
    * JQuery = 2
    * Python = 1
    * PHP = 4
    * Scala = 4
    * Clojure = 4
    * Haskell = 4
    * Golang = 3
    * Node.js = 4
    * Ruby = 2
    * Perl = 4
    * Java = 2
    * Angular = 4
    * Chef. = 4  (note: Ansible = 1)
1. In any language of your choice, write a utility that will translate a hexadecimal string to base64. Here's a test: this string `45766964696e74` should be converted into this string `RXZpZGludA== `.
    * **Solution**: [hexTo64](hexTo64/)
1. Download this [simple Python script](https://github.com/SignalPath/CodeTests/blob/master/specialMath.py). When you run it from the command line, it takes one parameter. So `$> python specialMath.py 7` will produce `79`. Also, `$> python specialMath.py 17` will produce `10926`. This question has two parts: first, convert it to Scala; second, have the script calculate `$> specialMath 90`.
    * **Solution**: [specialMath](specialMath/)
    * ```
      $ docker run ehontz/specialmath 90
      19740274219868223074
      ```
