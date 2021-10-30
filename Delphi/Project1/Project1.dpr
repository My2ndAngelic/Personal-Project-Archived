program Project1;

{$APPTYPE CONSOLE}

{$R *.res}

uses
  System.SysUtils;

var
  a: integer;
  b: integer;
  c: boolean;

begin
  write('Enter a: '); readln(a);
  write('Enter b: '); readln(b);
  writeln;
  write('gcd(', a, ', ', b, ') = ');

  while(a <> b) do
    if a > b then
      a := a - b
    else
      b := b - a;

  writeln(a);
  readln;
end.
