cmake_minimum_required(VERSION 3.24)
project(Codes_9)

set(CMAKE_CXX_STANDARD 14)

include_directories("Codes 9")

#add_executable(Codes_9
#        "Codes 9/stack.cpp"
#        "Codes 9/stack.h"
#        "Codes 9/stacker.cpp"
#
#
#        "Codes 9/stock02.cpp"
#        "Codes 9/stock02.h"
#
#        "Codes 9/usestok01.cpp"
#        "Codes 9/usestok02.cpp")

add_executable(code "Codes 9/stock00.cpp"
        "Codes 9/stock00.h" "Codes 9/usestck00.cpp")

add_executable(code1  "Codes 9/stock01.cpp"
        "Codes 9/stock01.h"
        "Codes 9/usestok01.cpp")

add_executable(code2 "Codes 9/stock02.cpp"
        "Codes 9/stock02.h"
        "Codes 9/usestok02.cpp")

add_executable(co "Codes 9/ex.cpp" "Codes 9/ex.hpp")

add_executable(coo "Codes 9/exx.cpp")