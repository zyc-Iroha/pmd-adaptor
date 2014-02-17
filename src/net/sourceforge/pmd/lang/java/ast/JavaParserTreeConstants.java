package net.sourceforge.pmd.lang.java.ast;

public abstract interface JavaParserTreeConstants
{
  public static final int JJTCOMPILATIONUNIT = 0;
  public static final int JJTPACKAGEDECLARATION = 1;
  public static final int JJTIMPORTDECLARATION = 2;
  public static final int JJTVOID = 3;
  public static final int JJTTYPEDECLARATION = 4;
  public static final int JJTCLASSORINTERFACEDECLARATION = 5;
  public static final int JJTEXTENDSLIST = 6;
  public static final int JJTIMPLEMENTSLIST = 7;
  public static final int JJTENUMDECLARATION = 8;
  public static final int JJTENUMBODY = 9;
  public static final int JJTENUMCONSTANT = 10;
  public static final int JJTTYPEPARAMETERS = 11;
  public static final int JJTTYPEPARAMETER = 12;
  public static final int JJTTYPEBOUND = 13;
  public static final int JJTCLASSORINTERFACEBODY = 14;
  public static final int JJTCLASSORINTERFACEBODYDECLARATION = 15;
  public static final int JJTFIELDDECLARATION = 16;
  public static final int JJTVARIABLEDECLARATOR = 17;
  public static final int JJTVARIABLEDECLARATORID = 18;
  public static final int JJTVARIABLEINITIALIZER = 19;
  public static final int JJTARRAYINITIALIZER = 20;
  public static final int JJTMETHODDECLARATION = 21;
  public static final int JJTMETHODDECLARATOR = 22;
  public static final int JJTFORMALPARAMETERS = 23;
  public static final int JJTFORMALPARAMETER = 24;
  public static final int JJTCONSTRUCTORDECLARATION = 25;
  public static final int JJTEXPLICITCONSTRUCTORINVOCATION = 26;
  public static final int JJTINITIALIZER = 27;
  public static final int JJTTYPE = 28;
  public static final int JJTREFERENCETYPE = 29;
  public static final int JJTCLASSORINTERFACETYPE = 30;
  public static final int JJTTYPEARGUMENTS = 31;
  public static final int JJTTYPEARGUMENT = 32;
  public static final int JJTWILDCARDBOUNDS = 33;
  public static final int JJTPRIMITIVETYPE = 34;
  public static final int JJTRESULTTYPE = 35;
  public static final int JJTNAME = 36;
  public static final int JJTNAMELIST = 37;
  public static final int JJTEXPRESSION = 38;
  public static final int JJTASSIGNMENTOPERATOR = 39;
  public static final int JJTCONDITIONALEXPRESSION = 40;
  public static final int JJTCONDITIONALOREXPRESSION = 41;
  public static final int JJTCONDITIONALANDEXPRESSION = 42;
  public static final int JJTINCLUSIVEOREXPRESSION = 43;
  public static final int JJTEXCLUSIVEOREXPRESSION = 44;
  public static final int JJTANDEXPRESSION = 45;
  public static final int JJTEQUALITYEXPRESSION = 46;
  public static final int JJTINSTANCEOFEXPRESSION = 47;
  public static final int JJTRELATIONALEXPRESSION = 48;
  public static final int JJTSHIFTEXPRESSION = 49;
  public static final int JJTADDITIVEEXPRESSION = 50;
  public static final int JJTMULTIPLICATIVEEXPRESSION = 51;
  public static final int JJTUNARYEXPRESSION = 52;
  public static final int JJTPREINCREMENTEXPRESSION = 53;
  public static final int JJTPREDECREMENTEXPRESSION = 54;
  public static final int JJTUNARYEXPRESSIONNOTPLUSMINUS = 55;
  public static final int JJTPOSTFIXEXPRESSION = 56;
  public static final int JJTCASTEXPRESSION = 57;
  public static final int JJTPRIMARYEXPRESSION = 58;
  public static final int JJTMEMBERSELECTOR = 59;
  public static final int JJTPRIMARYPREFIX = 60;
  public static final int JJTPRIMARYSUFFIX = 61;
  public static final int JJTLITERAL = 62;
  public static final int JJTBOOLEANLITERAL = 63;
  public static final int JJTNULLLITERAL = 64;
  public static final int JJTARGUMENTS = 65;
  public static final int JJTARGUMENTLIST = 66;
  public static final int JJTALLOCATIONEXPRESSION = 67;
  public static final int JJTARRAYDIMSANDINITS = 68;
  public static final int JJTSTATEMENT = 69;
  public static final int JJTLABELEDSTATEMENT = 70;
  public static final int JJTBLOCK = 71;
  public static final int JJTBLOCKSTATEMENT = 72;
  public static final int JJTLOCALVARIABLEDECLARATION = 73;
  public static final int JJTEMPTYSTATEMENT = 74;
  public static final int JJTSTATEMENTEXPRESSION = 75;
  public static final int JJTSWITCHSTATEMENT = 76;
  public static final int JJTSWITCHLABEL = 77;
  public static final int JJTIFSTATEMENT = 78;
  public static final int JJTWHILESTATEMENT = 79;
  public static final int JJTDOSTATEMENT = 80;
  public static final int JJTFORSTATEMENT = 81;
  public static final int JJTFORINIT = 82;
  public static final int JJTSTATEMENTEXPRESSIONLIST = 83;
  public static final int JJTFORUPDATE = 84;
  public static final int JJTBREAKSTATEMENT = 85;
  public static final int JJTCONTINUESTATEMENT = 86;
  public static final int JJTRETURNSTATEMENT = 87;
  public static final int JJTTHROWSTATEMENT = 88;
  public static final int JJTSYNCHRONIZEDSTATEMENT = 89;
  public static final int JJTTRYSTATEMENT = 90;
  public static final int JJTRESOURCESPECIFICATION = 91;
  public static final int JJTRESOURCES = 92;
  public static final int JJTRESOURCE = 93;
  public static final int JJTCATCHSTATEMENT = 94;
  public static final int JJTFINALLYSTATEMENT = 95;
  public static final int JJTASSERTSTATEMENT = 96;
  public static final int JJTRUNSIGNEDSHIFT = 97;
  public static final int JJTRSIGNEDSHIFT = 98;
  public static final int JJTANNOTATION = 99;
  public static final int JJTNORMALANNOTATION = 100;
  public static final int JJTMARKERANNOTATION = 101;
  public static final int JJTSINGLEMEMBERANNOTATION = 102;
  public static final int JJTMEMBERVALUEPAIRS = 103;
  public static final int JJTMEMBERVALUEPAIR = 104;
  public static final int JJTMEMBERVALUE = 105;
  public static final int JJTMEMBERVALUEARRAYINITIALIZER = 106;
  public static final int JJTANNOTATIONTYPEDECLARATION = 107;
  public static final int JJTANNOTATIONTYPEBODY = 108;
  public static final int JJTANNOTATIONTYPEMEMBERDECLARATION = 109;
  public static final int JJTANNOTATIONMETHODDECLARATION = 110;
  public static final int JJTDEFAULTVALUE = 111;
  public static final String[] jjtNodeName = { "CompilationUnit", "PackageDeclaration", "ImportDeclaration", "void", "TypeDeclaration", "ClassOrInterfaceDeclaration", "ExtendsList", "ImplementsList", "EnumDeclaration", "EnumBody", "EnumConstant", "TypeParameters", "TypeParameter", "TypeBound", "ClassOrInterfaceBody", "ClassOrInterfaceBodyDeclaration", "FieldDeclaration", "VariableDeclarator", "VariableDeclaratorId", "VariableInitializer", "ArrayInitializer", "MethodDeclaration", "MethodDeclarator", "FormalParameters", "FormalParameter", "ConstructorDeclaration", "ExplicitConstructorInvocation", "Initializer", "Type", "ReferenceType", "ClassOrInterfaceType", "TypeArguments", "TypeArgument", "WildcardBounds", "PrimitiveType", "ResultType", "Name", "NameList", "Expression", "AssignmentOperator", "ConditionalExpression", "ConditionalOrExpression", "ConditionalAndExpression", "InclusiveOrExpression", "ExclusiveOrExpression", "AndExpression", "EqualityExpression", "InstanceOfExpression", "RelationalExpression", "ShiftExpression", "AdditiveExpression", "MultiplicativeExpression", "UnaryExpression", "PreIncrementExpression", "PreDecrementExpression", "UnaryExpressionNotPlusMinus", "PostfixExpression", "CastExpression", "PrimaryExpression", "MemberSelector", "PrimaryPrefix", "PrimarySuffix", "Literal", "BooleanLiteral", "NullLiteral", "Arguments", "ArgumentList", "AllocationExpression", "ArrayDimsAndInits", "Statement", "LabeledStatement", "Block", "BlockStatement", "LocalVariableDeclaration", "EmptyStatement", "StatementExpression", "SwitchStatement", "SwitchLabel", "IfStatement", "WhileStatement", "DoStatement", "ForStatement", "ForInit", "StatementExpressionList", "ForUpdate", "BreakStatement", "ContinueStatement", "ReturnStatement", "ThrowStatement", "SynchronizedStatement", "TryStatement", "ResourceSpecification", "Resources", "Resource", "CatchStatement", "FinallyStatement", "AssertStatement", "RUNSIGNEDSHIFT", "RSIGNEDSHIFT", "Annotation", "NormalAnnotation", "MarkerAnnotation", "SingleMemberAnnotation", "MemberValuePairs", "MemberValuePair", "MemberValue", "MemberValueArrayInitializer", "AnnotationTypeDeclaration", "AnnotationTypeBody", "AnnotationTypeMemberDeclaration", "AnnotationMethodDeclaration", "DefaultValue" };
}