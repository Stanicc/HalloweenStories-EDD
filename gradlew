����   2 � androidx/core/graphics/ColorKt  java/lang/Object  
component1 (Landroid/graphics/Color;)F !Landroidx/annotation/RequiresApi; value    #Lorg/jetbrains/annotations/NotNull;     $this$component1  kotlin/jvm/internal/Intrinsics  checkParameterIsNotNull '(Ljava/lang/Object;Ljava/lang/String;)V  
   android/graphics/Color  getComponent (I)F  
   Landroid/graphics/Color; $i$f$component1 I 
component2 $this$component2  $i$f$component2 
component3 $this$component3 " $i$f$component3 
component4 $this$component4 & $i$f$component4 plus J(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color; 
$this$plus + c - !androidx/core/graphics/ColorUtils / compositeColors 1 *
 0 2 #ColorUtils.compositeColors(c, this) 4 checkExpressionValueIsNotNull 6 
  7 getAlpha (I)I Landroidx/annotation/ColorInt; $this$alpha $i$f$getAlpha getRed 	$this$red $i$f$getRed getGreen $this$green $i$f$getGreen getBlue 
$this$blue $i$f$getBlue getLuminance 	luminance H 
  I $this$luminance $i$f$getLuminance toColor (I)Landroid/graphics/Color; valueOf O N
  P Color.valueOf(this) R $this$toColor $i$f$toColor toColorLong (I)J pack X W
  Y $this$toColorLong $i$f$toColorLong (J)F red ^ ]
  _ J green b ]
  c blue e ]
  f alpha h ]
  i H ]
  k (J)Landroid/graphics/Color; O m
  n 
toColorInt (J)I toArgb r q
  s $this$toColorInt $i$f$toColorInt isSrgb (J)Z w x
  y $this$isSrgb $i$f$isSrgb isWideGamut } x
  ~ $this$isWideGamut $i$f$isWideGamut getColorSpace  (J)Landroid/graphics/ColorSpace; 
colorSpace � �
  � Color.colorSpace(this) � $this$colorSpace $i$f$getColorSpace 	convertTo '(ILandroid/graphics/ColorSpace$Named;)J � android/graphics/ColorSpace � get B(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace; � �
 � � convert !(ILandroid/graphics/ColorSpace;)J � �
  � $this$convertTo #Landroid/graphics/ColorSpace$Named; $i$f$convertTo Landroid/graphics/ColorSpace; '(JLandroid/graphics/ColorSpace$Named;)J !(JLandroid/graphics/ColorSpace;)J � �
  � U(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color; � 7(Landroid/graphics/ColorSpace;)Landroid/graphics/Color; � �
  � O(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color; (Ljava/lang/String;)I u 
parseColor � �
  � Ljava/lang/String; Lkotlin/Metadata; mv       bv    k    d1b��>
��



	










0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H
0*0H

 *00*02	0
H
 *00*02	0H0*02	0
H0*02	0H0*02	0
H0*02	0H 0*02!0H"0*0H"0*0H#0*0H#0*0$H%0*0H"��0*08Æ¢"��0*08Ç¢"0*08Æ¢"0*08Ç¢"	0
*08Ç¢"0*08Æ¢"0*08Ç¢"0*08Ç¢"0*08Ç¢"0*08Ç¢"0*08Ç¢"0*08Æ¢"0*08Ç¢¨& d2   kotlin.jvm.PlatformType core-ktx_release Color.kt Code LineNumberTable LocalVariableTable RuntimeInvisibleAnnotations $RuntimeInvisibleParameterAnnotations 
SourceFile RuntimeVisibleAnnotations 1       %     �   C     <*� *� �    �     	 ' �                 �       I 	 �     
       �   C     <*� *� �    �     	 5 �                  �       I 	 �     
    !   �   C     <*#� *� �    �     	 C �        "      $   �       I 	 �     
    %   �   C     <*'� *� �    �     	 Q �        &      (   �       I 	 �     
    ) *  �   L     *,� +.� +*� 3Y5� 8�    �      g �        +       -   �       I 	 
   �     
    
    9 :  �   @     <z �~�    �      o �        <     	 =   �     ;    > :  �   @     <z �~�    �      w �        ?     	 @   �     ;    A :  �   @     <z �~�    �       �        B     	 C   �     ;    D :  �   =     	< �~�    �      � �       	 E      F   �     ;     :  �   @     <z �~�    �      � �             	    �     ;     :  �   @     <z �~�    �      � �             	     �     ;    ! :  �   @     <z �~�    �      � �        "     	 $   �     ;    % :  �   =     	< �~�    �      � �       	 &      (   �     ;    G   �   <     <� J�    �      � �        K      L   �       I 	 �     ;    M N  �   B     <� QYS� 8�    �      � �        T      U   �       I 	 
   �     ;    V W  �   <     <� Z�    �      � �        [      \   �       I 	 �