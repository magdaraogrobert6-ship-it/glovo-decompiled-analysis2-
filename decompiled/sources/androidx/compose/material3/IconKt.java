package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import o.AndroidContentCaptureManager;
import o.UiMediaScopeKeyboardKindCompanion;
import o.accessgetFarcp;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract class IconKt {
    public static final Modifier RemoteActionCompatParcelizer;

    static {
        Modifier.Companion companion = Modifier.Companion;
        float f = SmallIconButtonTokens.write;
        RemoteActionCompatParcelizer = SizeKt.m83size3ABfNKs(companion, SmallIconButtonTokens.IconCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af A[PHI: r3 r4
  0x00af: PHI (r3v20 int) = (r3v5 int), (r3v21 int) binds: [B:57:0x009d, B:52:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r4v9 androidx.compose.ui.Modifier) = (r4v5 androidx.compose.ui.Modifier), (r4v11 androidx.compose.ui.Modifier) binds: [B:57:0x009d, B:52:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0151  */
    /* JADX WARN: Code duplicated, block: B:96:0x0166  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194  */
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m116Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        int i4;
        boolean z;
        final Modifier modifier3;
        final long j3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        long jM732unboximpl;
        boolean z2;
        Object objComponentActivity;
        Modifier modifierSemantics$default;
        Modifier modifier5;
        long jMo1424getIntrinsicSizeNHjbRc;
        boolean z3;
        Object objComponentActivity2;
        int i5;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2142239481);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.IconCompatParcelizer(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i & 3072) == 0) {
                j2 = j;
                if ((i2 & 8) == 0 || !getpostalcode.serializer(j2)) {
                    i5 = Fields.RotationZ;
                } else {
                    i5 = 2048;
                }
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = 0;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier4 = modifier2;
                } else {
                    if (i6 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    z2 = (((i3 & 7168) ^ 3072) <= 2048 && getpostalcode.serializer(jM732unboximpl)) || (i3 & 3072) == 2048;
                    objComponentActivity = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (!z2 || objComponentActivity == androidContentCaptureManager) {
                        if (Color.m723equalsimpl0(jM732unboximpl, Color.Companion.m758getUnspecified0d7_KjU())) {
                            objComponentActivity = null;
                        } else {
                            objComponentActivity = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, jM732unboximpl, 0, 2, null);
                        }
                        getpostalcode.write(objComponentActivity);
                    }
                    ColorFilter colorFilter = (ColorFilter) objComponentActivity;
                    if (str != null) {
                        getpostalcode.serializer(-536990979);
                        Modifier.Companion companion = Modifier.Companion;
                        if ((i3 & 112) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (!z3 || objComponentActivity2 == androidContentCaptureManager) {
                            objComponentActivity2 = new accessgetFarcp(i4, str);
                            getpostalcode.write(objComponentActivity2);
                        }
                        modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-536832197);
                        getpostalcode.IconCompatParcelizer(false);
                        modifierSemantics$default = Modifier.Companion;
                    }
                    Modifier modifier6 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4);
                    if (!Size.m542equalsimpl0(painter.mo1424getIntrinsicSizeNHjbRc(), Size.Companion.m554getUnspecifiedNHjbRc())) {
                        jMo1424getIntrinsicSizeNHjbRc = painter.mo1424getIntrinsicSizeNHjbRc();
                        if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32))) || !Float.isInfinite(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L)))) {
                            modifier5 = Modifier.Companion;
                        } else {
                            modifier5 = RemoteActionCompatParcelizer;
                        }
                    } else {
                        modifier5 = RemoteActionCompatParcelizer;
                    }
                    BoxKt.Box(PainterModifierKt.paint$default(modifier6.then(modifier5), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(modifierSemantics$default), getpostalcode, 0);
                    modifier3 = modifier4;
                    j3 = jM732unboximpl;
                }
                jM732unboximpl = j2;
                getpostalcode.RemoteActionCompatParcelizer();
                if (((i3 & 7168) ^ 3072) <= 2048) {
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                if (!z2) {
                    if (Color.m723equalsimpl0(jM732unboximpl, Color.Companion.m758getUnspecified0d7_KjU())) {
                        objComponentActivity = null;
                    } else {
                        objComponentActivity = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, jM732unboximpl, 0, 2, null);
                    }
                    getpostalcode.write(objComponentActivity);
                } else {
                    if (Color.m723equalsimpl0(jM732unboximpl, Color.Companion.m758getUnspecified0d7_KjU())) {
                        objComponentActivity = null;
                    } else {
                        objComponentActivity = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, jM732unboximpl, 0, 2, null);
                    }
                    getpostalcode.write(objComponentActivity);
                }
                ColorFilter colorFilter2 = (ColorFilter) objComponentActivity;
                if (str != null) {
                    getpostalcode.serializer(-536990979);
                    Modifier.Companion companion2 = Modifier.Companion;
                    if ((i3 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (!z3) {
                        objComponentActivity2 = new accessgetFarcp(i4, str);
                        getpostalcode.write(objComponentActivity2);
                    } else {
                        objComponentActivity2 = new accessgetFarcp(i4, str);
                        getpostalcode.write(objComponentActivity2);
                    }
                    modifierSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-536832197);
                    getpostalcode.IconCompatParcelizer(false);
                    modifierSemantics$default = Modifier.Companion;
                }
                Modifier modifier7 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4);
                if (!Size.m542equalsimpl0(painter.mo1424getIntrinsicSizeNHjbRc(), Size.Companion.m554getUnspecifiedNHjbRc())) {
                    jMo1424getIntrinsicSizeNHjbRc = painter.mo1424getIntrinsicSizeNHjbRc();
                    if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32)))) {
                    }
                    modifier5 = Modifier.Companion;
                } else {
                    modifier5 = RemoteActionCompatParcelizer;
                }
                BoxKt.Box(PainterModifierKt.paint$default(modifier7.then(modifier5), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter2, 22, null).then(modifierSemantics$default), getpostalcode, 0);
                modifier3 = modifier4;
                j3 = jM732unboximpl;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                j3 = j2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getNeartKroMQ
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        androidx.compose.material3.IconKt.m116Iconww6aTOc(painter, str, modifier3, j3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            j2 = j;
            if ((i2 & 8) == 0) {
                i5 = Fields.RotationZ;
            } else {
                i5 = Fields.RotationZ;
            }
            i3 |= i5;
        } else {
            j2 = j;
        }
        i4 = 0;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i6 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                } else {
                    jM732unboximpl = j2;
                }
            } else {
                if (i6 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                } else {
                    jM732unboximpl = j2;
                }
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (((i3 & 7168) ^ 3072) <= 2048) {
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
            if (!z2) {
                if (Color.m723equalsimpl0(jM732unboximpl, Color.Companion.m758getUnspecified0d7_KjU())) {
                    objComponentActivity = null;
                } else {
                    objComponentActivity = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, jM732unboximpl, 0, 2, null);
                }
                getpostalcode.write(objComponentActivity);
            } else {
                if (Color.m723equalsimpl0(jM732unboximpl, Color.Companion.m758getUnspecified0d7_KjU())) {
                    objComponentActivity = null;
                } else {
                    objComponentActivity = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, jM732unboximpl, 0, 2, null);
                }
                getpostalcode.write(objComponentActivity);
            }
            ColorFilter colorFilter3 = (ColorFilter) objComponentActivity;
            if (str != null) {
                getpostalcode.serializer(-536990979);
                Modifier.Companion companion3 = Modifier.Companion;
                if ((i3 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!z3) {
                    objComponentActivity2 = new accessgetFarcp(i4, str);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new accessgetFarcp(i4, str);
                    getpostalcode.write(objComponentActivity2);
                }
                modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, 1, null);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-536832197);
                getpostalcode.IconCompatParcelizer(false);
                modifierSemantics$default = Modifier.Companion;
            }
            Modifier modifier8 = GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4);
            if (!Size.m542equalsimpl0(painter.mo1424getIntrinsicSizeNHjbRc(), Size.Companion.m554getUnspecifiedNHjbRc())) {
                jMo1424getIntrinsicSizeNHjbRc = painter.mo1424getIntrinsicSizeNHjbRc();
                if (Float.isInfinite(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32)))) {
                }
                modifier5 = Modifier.Companion;
            } else {
                modifier5 = RemoteActionCompatParcelizer;
            }
            BoxKt.Box(PainterModifierKt.paint$default(modifier8.then(modifier5), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter3, 22, null).then(modifierSemantics$default), getpostalcode, 0);
            modifier3 = modifier4;
            j3 = jM732unboximpl;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            j3 = j2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getNeartKroMQ
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.IconKt.m116Iconww6aTOc(painter, str, modifier3, j3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m117Iconww6aTOc(final ImageVector imageVector, final String str, Modifier modifier, long j, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM732unboximpl;
        boolean z;
        Modifier modifier3;
        long j2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i4;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-126890956);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    jM732unboximpl = j;
                    if (getpostalcode.serializer(jM732unboximpl)) {
                        i4 = Fields.CameraDistance;
                    }
                    i3 |= i4;
                } else {
                    jM732unboximpl = j;
                }
                i4 = Fields.RotationZ;
                i3 |= i4;
            } else {
                jM732unboximpl = j;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                    if (i5 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 8) != 0) {
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        i3 &= -7169;
                    }
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 8) != 0) {
                        modifier3 = modifier2;
                        i3 &= -7169;
                    } else {
                        modifier3 = modifier2;
                    }
                }
                j2 = jM732unboximpl;
                getpostalcode.RemoteActionCompatParcelizer();
                m116Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, getpostalcode, i3 & 14), str, modifier3, j2, getpostalcode, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                j2 = jM732unboximpl;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                final Modifier modifier4 = modifier3;
                final long j3 = j2;
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UiMediaScopeViewingDistanceCompanion
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        androidx.compose.material3.IconKt.m117Iconww6aTOc(imageVector, str, modifier4, j3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                jM732unboximpl = j;
                if (getpostalcode.serializer(jM732unboximpl)) {
                    i4 = Fields.CameraDistance;
                }
                i3 |= i4;
            } else {
                jM732unboximpl = j;
            }
            i4 = Fields.RotationZ;
            i3 |= i4;
        } else {
            jM732unboximpl = j;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    i3 &= -7169;
                }
            } else {
                if (i5 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 8) != 0) {
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    i3 &= -7169;
                }
            }
            j2 = jM732unboximpl;
            getpostalcode.RemoteActionCompatParcelizer();
            m116Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, getpostalcode, i3 & 14), str, modifier3, j2, getpostalcode, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            j2 = jM732unboximpl;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier5 = modifier3;
            final long j4 = j2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.UiMediaScopeViewingDistanceCompanion
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    androidx.compose.material3.IconKt.m117Iconww6aTOc(imageVector, str, modifier5, j4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
