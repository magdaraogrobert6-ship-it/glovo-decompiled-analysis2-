package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.UiMediaScopeKeyboardKindCompanion;
import o.UiMediaScopeViewingDistance;
import o.ZIndexNode;
import o.accessgetMediumcp;
import o.accessisRelatedToAutoCommit;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getDataType;
import o.getFartKroMQ;
import o.getFlatm18o9QQ;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTabletopm18o9QQ;
import o.getUnspecifiedy9eOQZs;
import o.getViewingDistancetKroMQ;
import o.getWindowPosturem18o9QQ;
import o.isDate;
import o.onReceive;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setImeVisible;

/* JADX INFO: loaded from: classes.dex */
public abstract class IconButtonKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x0145  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0190  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        int i7;
        boolean z3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        Modifier modifier3;
        boolean z4;
        IconButtonColors iconButtonColors2;
        Shape shape2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        long jM732unboximpl;
        getViewingDistancetKroMQ getviewingdistancetkromq;
        IconButtonColors iconButtonColorsM115copyjRlVdoo;
        MutableInteractionSourceImpl mutableInteractionSourceImpl4;
        Shape shape3;
        int i8;
        IconButtonColors iconButtonColors3;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1413012038);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (getpostalcode.write(z2)) {
                        i5 = Fields.RotationX;
                    } else {
                        i5 = Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    i3 |= Fields.RotationZ;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        if (getpostalcode.read(mutableInteractionSourceImpl2)) {
                            i7 = Fields.Clip;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= 65536;
                    }
                    if ((1572864 & i) == 0) {
                        if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                            i9 = 1048576;
                        } else {
                            i9 = Fields.BlendMode;
                        }
                        i3 |= i9;
                    }
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (getpostalcode.write(i3 & 1, z3)) {
                        getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                        if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            shape3 = shape;
                            i8 = i3 & (-465921);
                            modifier4 = modifier2;
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl2;
                            iconButtonColors3 = iconButtonColors;
                        } else {
                            if (i10 != 0) {
                                modifier4 = Modifier.Companion;
                            } else {
                                modifier4 = modifier2;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                            getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                            iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                            if (iconButtonColorsM115copyjRlVdoo == null) {
                                Color.Companion companion = Color.Companion;
                                iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion.m757getTransparent0d7_KjU(), jM732unboximpl, companion.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                                getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                            }
                            if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                                iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            }
                            if (i6 != 0) {
                                mutableInteractionSourceImpl4 = null;
                            } else {
                                mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                            }
                            shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                            i8 = i3 & (-465921);
                            iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                        }
                        getpostalcode.RemoteActionCompatParcelizer();
                        int i11 = i8 << 3;
                        IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i11 & 458752) | ((i8 >> 3) & 14) | (i11 & 112) | (i8 & 896) | (i8 & 3670016));
                        MutableInteractionSourceImpl mutableInteractionSourceImpl5 = mutableInteractionSourceImpl4;
                        iconButtonColors2 = iconButtonColors3;
                        modifier3 = modifier4;
                        z4 = z2;
                        shape2 = shape3;
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl5;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                        modifier3 = modifier2;
                        z4 = z2;
                        iconButtonColors2 = iconButtonColors;
                        shape2 = shape;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
                    }
                }
                i3 |= 24576;
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion2 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion2.m757getTransparent0d7_KjU(), jM732unboximpl, companion2.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    } else {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion3 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion3.m757getTransparent0d7_KjU(), jM732unboximpl, companion3.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    int i12 = i8 << 3;
                    IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i12 & 458752) | ((i8 >> 3) & 14) | (i12 & 112) | (i8 & 896) | (i8 & 3670016));
                    MutableInteractionSourceImpl mutableInteractionSourceImpl6 = mutableInteractionSourceImpl4;
                    iconButtonColors2 = iconButtonColors3;
                    modifier3 = modifier4;
                    z4 = z2;
                    shape2 = shape3;
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl6;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                    modifier3 = modifier2;
                    z4 = z2;
                    iconButtonColors2 = iconButtonColors;
                    shape2 = shape;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                i3 |= Fields.RotationZ;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                    if (getpostalcode.read(mutableInteractionSourceImpl2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion4 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion4.m757getTransparent0d7_KjU(), jM732unboximpl, companion4.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    } else {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion5 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion5.m757getTransparent0d7_KjU(), jM732unboximpl, companion5.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    int i13 = i8 << 3;
                    IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i13 & 458752) | ((i8 >> 3) & 14) | (i13 & 112) | (i8 & 896) | (i8 & 3670016));
                    MutableInteractionSourceImpl mutableInteractionSourceImpl7 = mutableInteractionSourceImpl4;
                    iconButtonColors2 = iconButtonColors3;
                    modifier3 = modifier4;
                    z4 = z2;
                    shape2 = shape3;
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl7;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                    modifier3 = modifier2;
                    z4 = z2;
                    iconButtonColors2 = iconButtonColors;
                    shape2 = shape;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 24576;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i3 |= i9;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion6 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion6.m757getTransparent0d7_KjU(), jM732unboximpl, companion6.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                } else {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion7 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion7.m757getTransparent0d7_KjU(), jM732unboximpl, companion7.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                int i14 = i8 << 3;
                IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i14 & 458752) | ((i8 >> 3) & 14) | (i14 & 112) | (i8 & 896) | (i8 & 3670016));
                MutableInteractionSourceImpl mutableInteractionSourceImpl8 = mutableInteractionSourceImpl4;
                iconButtonColors2 = iconButtonColors3;
                modifier3 = modifier4;
                z4 = z2;
                shape2 = shape3;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl8;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                modifier3 = modifier2;
                z4 = z2;
                iconButtonColors2 = iconButtonColors;
                shape2 = shape;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (getpostalcode.write(z2)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i3 |= Fields.RotationZ;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                    if (getpostalcode.read(mutableInteractionSourceImpl2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i3 |= i9;
                }
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i & 1) == 0) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion8 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion8.m757getTransparent0d7_KjU(), jM732unboximpl, companion8.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    } else {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                        getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                        iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                        if (iconButtonColorsM115copyjRlVdoo == null) {
                            Color.Companion companion9 = Color.Companion;
                            iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion9.m757getTransparent0d7_KjU(), jM732unboximpl, companion9.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                            getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                        }
                        if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                            iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        }
                        if (i6 != 0) {
                            mutableInteractionSourceImpl4 = null;
                        } else {
                            mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                        }
                        shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i8 = i3 & (-465921);
                        iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    int i15 = i8 << 3;
                    IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i15 & 458752) | ((i8 >> 3) & 14) | (i15 & 112) | (i8 & 896) | (i8 & 3670016));
                    MutableInteractionSourceImpl mutableInteractionSourceImpl9 = mutableInteractionSourceImpl4;
                    iconButtonColors2 = iconButtonColors3;
                    modifier3 = modifier4;
                    z4 = z2;
                    shape2 = shape3;
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl9;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                    modifier3 = modifier2;
                    z4 = z2;
                    iconButtonColors2 = iconButtonColors;
                    shape2 = shape;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 24576;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i3 |= i9;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion10 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion10.m757getTransparent0d7_KjU(), jM732unboximpl, companion10.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                } else {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion11 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion11.m757getTransparent0d7_KjU(), jM732unboximpl, companion11.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                int i16 = i8 << 3;
                IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i16 & 458752) | ((i8 >> 3) & 14) | (i16 & 112) | (i8 & 896) | (i8 & 3670016));
                MutableInteractionSourceImpl mutableInteractionSourceImpl10 = mutableInteractionSourceImpl4;
                iconButtonColors2 = iconButtonColors3;
                modifier3 = modifier4;
                z4 = z2;
                shape2 = shape3;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl10;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                modifier3 = modifier2;
                z4 = z2;
                iconButtonColors2 = iconButtonColors;
                shape2 = shape;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            i3 |= Fields.RotationZ;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                if (getpostalcode.read(mutableInteractionSourceImpl2)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i3 |= i9;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion12 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion12.m757getTransparent0d7_KjU(), jM732unboximpl, companion12.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                } else {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                    getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                    iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                    if (iconButtonColorsM115copyjRlVdoo == null) {
                        Color.Companion companion13 = Color.Companion;
                        iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion13.m757getTransparent0d7_KjU(), jM732unboximpl, companion13.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                        getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                    }
                    if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                        iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    }
                    if (i6 != 0) {
                        mutableInteractionSourceImpl4 = null;
                    } else {
                        mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                    }
                    shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i8 = i3 & (-465921);
                    iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                int i17 = i8 << 3;
                IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i17 & 458752) | ((i8 >> 3) & 14) | (i17 & 112) | (i8 & 896) | (i8 & 3670016));
                MutableInteractionSourceImpl mutableInteractionSourceImpl11 = mutableInteractionSourceImpl4;
                iconButtonColors2 = iconButtonColors3;
                modifier3 = modifier4;
                z4 = z2;
                shape2 = shape3;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl11;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
                modifier3 = modifier2;
                z4 = z2;
                iconButtonColors2 = iconButtonColors;
                shape2 = shape;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 24576;
        mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = 1048576;
            } else {
                i9 = Fields.BlendMode;
            }
            i3 |= i9;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i3 & 1, z3)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                if (iconButtonColorsM115copyjRlVdoo == null) {
                    Color.Companion companion14 = Color.Companion;
                    iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion14.m757getTransparent0d7_KjU(), jM732unboximpl, companion14.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                }
                if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                    iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                }
                if (i6 != 0) {
                    mutableInteractionSourceImpl4 = null;
                } else {
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                }
                shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                i8 = i3 & (-465921);
                iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
            } else {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                jM732unboximpl = ((Color) getpostalcode.write((getNewPassword) UiMediaScopeKeyboardKindCompanion.read)).m732unboximpl();
                getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
                iconButtonColorsM115copyjRlVdoo = getviewingdistancetkromq.serializer;
                if (iconButtonColorsM115copyjRlVdoo == null) {
                    Color.Companion companion15 = Color.Companion;
                    iconButtonColorsM115copyjRlVdoo = new IconButtonColors(companion15.m757getTransparent0d7_KjU(), jM732unboximpl, companion15.m757getTransparent0d7_KjU(), Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                    getviewingdistancetkromq.serializer = iconButtonColorsM115copyjRlVdoo;
                }
                if (!Color.m723equalsimpl0(iconButtonColorsM115copyjRlVdoo.write, jM732unboximpl)) {
                    iconButtonColorsM115copyjRlVdoo = iconButtonColorsM115copyjRlVdoo.m115copyjRlVdoo(iconButtonColorsM115copyjRlVdoo.read, jM732unboximpl, iconButtonColorsM115copyjRlVdoo.IconCompatParcelizer, Color.m721copywmQWz5c$default(jM732unboximpl, getDataType.IconCompatParcelizer, 0.0f, 0.0f, 0.0f, 14, null));
                }
                if (i6 != 0) {
                    mutableInteractionSourceImpl4 = null;
                } else {
                    mutableInteractionSourceImpl4 = mutableInteractionSourceImpl;
                }
                shape3 = setImeVisible.read(SmallIconButtonTokens.RemoteActionCompatParcelizer, getpostalcode);
                i8 = i3 & (-465921);
                iconButtonColors3 = iconButtonColorsM115copyjRlVdoo;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            int i18 = i8 << 3;
            IconButtonImpl(modifier4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z2, shape3, iconButtonColors3, mutableInteractionSourceImpl4, dragAndDropTargetModifierNode, getpostalcode, (i18 & 458752) | ((i8 >> 3) & 14) | (i18 & 112) | (i8 & 896) | (i8 & 3670016));
            MutableInteractionSourceImpl mutableInteractionSourceImpl12 = mutableInteractionSourceImpl4;
            iconButtonColors2 = iconButtonColors3;
            modifier3 = modifier4;
            z4 = z2;
            shape2 = shape3;
            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl12;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            modifier3 = modifier2;
            z4 = z2;
            iconButtonColors2 = iconButtonColors;
            shape2 = shape;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier3, z4, iconButtonColors2, mutableInteractionSourceImpl3, shape2, dragAndDropTargetModifierNode, i, i2);
        }
    }

    public static final void serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, position positionVar, MutableInteractionSourceImpl mutableInteractionSourceImpl, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1481353380);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(iconButtonColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(positionVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(mutableInteractionSourceImpl) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(getUnspecifiedy9eOQZs.RemoteActionCompatParcelizer) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i2 & 1, (4793491 & i2) != 4793490)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, shape, iconButtonColors, positionVar, mutableInteractionSourceImpl, getpostalcode, i2 & 33554430);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFlatm18o9QQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, shape, iconButtonColors, positionVar, mutableInteractionSourceImpl, i, 0);
        }
    }

    public static final void read(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, position positionVar, MutableInteractionSourceImpl mutableInteractionSourceImpl, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        long j;
        long j2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-171935091);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.read(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.read(iconButtonColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode2.read(positionVar) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.read(mutableInteractionSourceImpl) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(getUnspecifiedy9eOQZs.RemoteActionCompatParcelizer) ? 8388608 : 4194304;
        }
        if (getpostalcode2.write(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new UiMediaScopeViewingDistance(0);
                getpostalcode2.write(objComponentActivity);
            }
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, 1, null);
            if (z) {
                j = iconButtonColors.read;
            } else {
                j = iconButtonColors.IconCompatParcelizer;
            }
            long j3 = j;
            if (z) {
                j2 = iconButtonColors.write;
            } else {
                j2 = iconButtonColors.RemoteActionCompatParcelizer;
            }
            int i3 = i2 << 9;
            getpostalcode = getpostalcode2;
            SurfaceKt.m127Surfaceo_FOJdg(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierSemantics$default, z, shape, j3, j2, 0.0f, 0.0f, positionVar, mutableInteractionSourceImpl, ExtrasKt.write(669231714, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.IconButtonKt$SurfaceIconButton$2
                /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier.Companion companion = Modifier.Companion;
                        float f = SmallIconButtonTokens.serializer;
                        long jM3695DpSizeYgX7TsA = DpKt.m3695DpSizeYgX7TsA(Dp.m3673constructorimpl(SmallIconButtonTokens.IconCompatParcelizer + Dp.m3673constructorimpl(f + f)), SmallIconButtonTokens.write);
                        FillElement fillElement = SizeKt.serializer;
                        Modifier modifierM84sizeVpY3zN4 = SizeKt.m84sizeVpY3zN4(companion, DpSize.m3771getWidthD9Ej5fM(jM3695DpSizeYgX7TsA), DpSize.m3769getHeightD9Ej5fM(jM3695DpSizeYgX7TsA));
                        MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
                        int iSerializer = SentryUUID.serializer(getpostalcode3);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifierM84sizeVpY3zN4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode3.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode3.ComponentActivity) {
                            getpostalcode3.serializer(constructor);
                        } else {
                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        if (getpostalcode3.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode3.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode3, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, companion2.getSetModifier());
                        getUnspecifiedy9eOQZs.RemoteActionCompatParcelizer.invoke(getpostalcode3, 0);
                        getpostalcode3.IconCompatParcelizer(true);
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode2), getpostalcode, (i2 & 8078) | (234881024 & i3) | (i3 & 1879048192), 192);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFlatm18o9QQ(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, z, shape, iconButtonColors, positionVar, mutableInteractionSourceImpl, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0194  */
    public static final void IconButtonImpl(Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        long j;
        long j2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1134296466);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.write(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(iconButtonColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.read(mutableInteractionSourceImpl) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 1048576 : Fields.BlendMode;
        }
        int i3 = i2;
        if (getpostalcode.write(i3 & 1, (i3 & 599187) != 599186)) {
            if (mutableInteractionSourceImpl == null) {
                getpostalcode.serializer(977045485);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
                }
                getpostalcode.IconCompatParcelizer(false);
                mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) objComponentActivity;
            } else {
                getpostalcode.serializer(862800938);
                getpostalcode.IconCompatParcelizer(false);
                mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            }
            HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
            Modifier modifierThen = modifier.then(ZIndexNode.serializer);
            float f = SmallIconButtonTokens.serializer;
            long jM3695DpSizeYgX7TsA = DpKt.m3695DpSizeYgX7TsA(Dp.m3673constructorimpl(SmallIconButtonTokens.IconCompatParcelizer + Dp.m3673constructorimpl(f + f)), SmallIconButtonTokens.write);
            FillElement fillElement = SizeKt.serializer;
            Modifier modifierClip = ClipKt.clip(SizeKt.m84sizeVpY3zN4(modifierThen, DpSize.m3771getWidthD9Ej5fM(jM3695DpSizeYgX7TsA), DpSize.m3769getHeightD9Ej5fM(jM3695DpSizeYgX7TsA)), shape);
            if (z) {
                j = iconButtonColors.read;
            } else {
                j = iconButtonColors.IconCompatParcelizer;
            }
            Modifier modifierThen2 = ClickableKt.serializer(BackgroundKt.m20backgroundbw27NRU(modifierClip, j, shape), mutableInteractionSourceImpl2, onReceive.serializer(0.0f, 0L, 7), z, Role.m2807boximpl(Role.Companion.m2814getButtono7Vup1c()), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 8).then(new isDate(new accessisRelatedToAutoCommit(26)));
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                if (z) {
                    j2 = iconButtonColors.write;
                } else {
                    j2 = iconButtonColors.RemoteActionCompatParcelizer;
                }
                AndroidContentCaptureManagerCompanion.read(UiMediaScopeKeyboardKindCompanion.read.write(Color.m712boximpl(j2)), dragAndDropTargetModifierNode, getpostalcode, ((i3 >> 15) & 112) | 8);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTabletopm18o9QQ(modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, shape, iconButtonColors, mutableInteractionSourceImpl, dragAndDropTargetModifierNode, i, 0);
        }
    }
}
