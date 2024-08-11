cmake_minimum_required(VERSION 3.24)
project(Codes_11)

set(CMAKE_CXX_STANDARD 14)

include_directories("Codes 11")

add_executable(Codes_11
#        "Codes 11/placenew1.cpp"
#        "Codes 11/placenew2.cpp"
        "Codes 11/sayings1.cpp"
#        "Codes 11/sayings2.cpp"
#        "Codes 11/strbad.h"
        "Codes 11/string1.cpp"
        "Codes 11/string1.h"
#        "Codes 11/strngbad.cpp"
#        "Codes 11/vegnews.cpp"
        )

add_executable(Codes "Codes 11/ex.cpp" "Codes 11/ex.h")
