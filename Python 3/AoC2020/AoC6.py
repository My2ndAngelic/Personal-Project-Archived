import AoCUtilities
import os


def main():
    lines = AoCUtilities.fileReaderToArray(os.getcwd() + "/input/input6.txt")
    lines = list(map(lambda elem: elem[:-1], lines))
    print(lines)


if __name__ == '__main__':
    main()
