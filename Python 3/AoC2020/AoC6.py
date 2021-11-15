import AoCUtilities
import os


def main():
    lines = AoCUtilities.fileReaderToArray(os.getcwd() + "/input/input6.txt")
    lines = list(map(lambda elem: elem[:-1], lines))
    lines.append('')

    output = ""
    temp1 = []
    for line in lines:
        if line != "":
            output += line
        else:
            temp1.append(output)
            output = ""
    print(lines)
    print(temp1)
    counter = 0
    temp11 = []

    for i in range(len(temp1)):
        my_str = temp1[i]
        my_list = []
        for j in my_str:
            if not (j in my_list):
                my_list.append(j)
        newStr = ''.join(my_list)
        temp11.append(newStr)

    for i in temp11:
        counter += len(i)
        print(counter)

    print(temp11)


if __name__ == '__main__':
    main()
