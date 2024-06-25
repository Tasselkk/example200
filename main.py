# /usr/bin/envs python3
# -*- coding: utf-8 -*-
# 这是单行注释，上面的是shebang用法和设置编码

'''
多行注释
'''
"""
也是多行注释
"""
print("hello")
print('I " python program') # 字符串中有"时，用('xxx')
print("I'am python program") # 字符串中有'时，用("xxx")
print("""rgrthg'efger"rgr""")
print('''rgrthg'efger"rgr''') # 字符串中'和"都时，用('''xxx''') 或者("""xxx""")

# ======================================
# =             数据类型                =
# ======================================
'''
Python3 中常见的数据类型有:
Number(数字) : int、float、bool、complex（复数）
String(字符串)
bool(布尔类型)
List(列表)
Tuple(元组)
Set(集合)
Dictionary(字典)
Python3 的六个标准数据类型中:

不可变数据(3 个):Number(数字)、String(字符串)、Tuple(元组);
可变数据(3 个):List(列表)、Dictionary(字典)、Set(集合)。
'''
a = 1;
b = True
c = 0.3333333
d = 1 + 3j


print(isinstance(a, int)) # isinstance用于检查变量类型，此处打印 True
print(type(a)) # 也可用type()函数，此处打印<class 'int'>
print(type(b)) # 打印<class 'bool'>
print(type(c)) # 打印<class 'float'>
print(type(d)) # 打印<class 'complex'>

# Python3 中，bool 是 int 的子类，True 和 False 可以和数字相加
print(3 + True) # 4
print(2 + False) # 2
print(False + True) # 1

# 用 del删除变量
e = 10
f = 11

print(e,f)
del e,f
# print(e) 此处会报NameError: name 'e' is not defined
# 元素   a         b          c           d           e           f           g           h           i           j
# 正下标 0         1          2           3           4           5           6           7           8           9
# 负下标 -10      -9         -8          -7          -6          -5          -4          -3          -2          -1
e = "abcdefghij"
print(e) # abcdefghij
print(e[9]) # j
print(e[-1]) # j 可以理解为对区间取模10，10是字符串长度, (-1 + 10)%10 = 9, 所以e[-1]和e[9]相同
print("===============================================================================")
print(e[5:9]) # 从e[5]开始，打印9 - 5 = 4个:打印e[5]到e[8],即 fghi
print(e[-5:-1]) # fghi 解释见 68 行
print("===============================================================================")
print(e[0:-2]) # abcdefgh 打印字符串第一个a到倒数第三个字符h（不包含倒数第二个字符）
print(e[:8]) # abcdefgh 从字符串开始，打印 8 - 0 = 8 个
#其实e[0:-2]这个，可以理解为对区间取模10，10是字符串长度，[0:-2] ---> [(0 + 10)%10,(-2 + 10)%10] = [0,8]，所以和[:8]一样
print(e[5:]) # fghij 从e[5]开始，打印到字符串结尾

# https://www.runoob.com/python3/python3-data-type.html 该学 列表
