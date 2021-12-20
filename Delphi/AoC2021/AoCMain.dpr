program AoCMain;

{$APPTYPE CONSOLE}

{$R *.res}

uses
  System.SysUtils, Generics.Collections, Classes,
  AoCUtilities in 'AoCUtilities.pas',
  AoC1 in 'AoC1.pas';

type
  StrArray = array of String;

var
  dataIn: StrArray;
  temp: String;
  TempTLS:  TList<String>;

begin
    try
      Writeln('Hello');
      SetCurrentDir('../../input/');
      TempTLS := TList<String>.Create(AoCUtilities.FileReaderToTListString('input1.txt'));
      Writeln(TempTLS.Count);
      Writeln('Success');
      Readln;
    except
      on E: Exception do
      begin
        WriteLn(E.ClassName+ ': ' + E.Message);
      end;
    end;
end.

