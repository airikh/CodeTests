# hexTo64
CLI tool for converting hexadecimal (base16-encoded string) to a base64-encoded string. 

## Usage
```
$ docker run ehontz/hexto64 HEX_STRING
```
where `HEX_STRING` is the hexadecimal string you want to convert.

There is also a help message available via the `-h|--help` flag:
```
$ docker run ehontz/hexto64 -h
hexTo64 1.0.0
Usage: hexTo64 HEX_STRING
hexTo64 converts the provided hexadecimal (base16) string to a base64-encoded string
         
  -h, --help      Show help message
  -v, --version   Show version of this program

 trailing arguments:
  HEX_STRING (required)   Hexadecimal (base16) string.
```

**Note**: Running via the sbt console or running the Bash entry point of the .zip distribution (`bin/specialmath`) is _significantly_ faster than with `docker run`, due to the container startup time.

## Developer
This is an sbt project.


### Compile
```
> sbt compile
```

### Create docker image
```
> sbt Docker/publishLocal
```

### Create a .zip distribution
```
> sbt dist
```

### Test
```
> sbt test
```