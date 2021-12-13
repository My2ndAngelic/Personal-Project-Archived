unit AoCUtilities;

interface
uses
  SysUtils, Generics.Collections;

implementation
  function Double(Value: Integer): Integer;
  begin
    Double := Value * 2;
  end;

  function FileReaderToArray(MyInput : String): TList<String>;
  type
    MyFile = File of String;
  var
    MyReturn : TList<String>;
  begin
  MyReturn := TList<String>.Create;
    try

    finally

    end;
  end;

end.
