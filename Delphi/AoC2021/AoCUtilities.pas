unit AoCUtilities;

interface
uses
  SysUtils, Generics.Collections;

implementation
  function Double(Value: Integer): Integer;
  begin
    Double := Value * 2;
  end;

  function FileReaderToArray(fileDir : String): TList<String>;
  var
    MyFile: TextFile;
    MyReturn : TList<String>;
  begin
  MyReturn := TList<String>.Create;
    try
      AssignFile(MyFile, fileDir);
    finally

    end;
  end;

end.
