def main():
    k = 1
    x = 25
    # for x in range(k, k+101):
    lst = []
    print(x)
    while x not in lst:
        lst.append(x)
        if x % 2 == 0:
            x //= 2
        else:
            x = 3 * x + 7
        print(x)
    print('---')


if __name__ == '__main__':
    main()
