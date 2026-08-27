package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import o.AccessibilityUtilKt;
import o.BasicTooltipKthandleGestures11;
import o.PagerStaterequestScrollToPage1;
import o.SwitchDefaults;
import o.SwitchKt;
import o.TapGestureDetectorKtprocessTapGesture3;
import o.TooltipStateImplshow2;
import o.accessanimateWithTarget;
import o.constructorimpl;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.isNotGestureActionfoundation;
import o.notifyFocusedRectfoundation;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class LazyDslKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x0131  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, SwitchKt switchKt, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, constructorimpl constructorimplVar, boolean z, isNotGestureActionfoundation isnotgestureactionfoundation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        LazyListState lazyListStateRemoteActionCompatParcelizer;
        SwitchKt switchDefaults;
        int i4;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        int i6;
        constructorimpl constructorimplVar2;
        int i7;
        boolean z2;
        boolean z3;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal start;
        isNotGestureActionfoundation isnotgestureactionfoundationSerializer;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i8;
        accessanimateWithTarget accessanimatewithtarget;
        boolean z4;
        Object objComponentActivity;
        int i9;
        int i10;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(53695811);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListStateRemoteActionCompatParcelizer = lazyListState;
                int i11 = getpostalcode.read(lazyListStateRemoteActionCompatParcelizer) ? 32 : 16;
                i3 |= i11;
            } else {
                lazyListStateRemoteActionCompatParcelizer = lazyListState;
            }
            i3 |= i11;
        } else {
            lazyListStateRemoteActionCompatParcelizer = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                switchDefaults = switchKt;
                i3 |= getpostalcode.read(switchDefaults) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    int i13 = getpostalcode.read(vertical2) ? Fields.Clip : 8192;
                    i4 |= i13;
                } else {
                    vertical2 = vertical;
                }
                i4 |= i13;
            } else {
                vertical2 = vertical;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    if (getpostalcode.read(horizontal2)) {
                        i6 = Fields.RenderEffect;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        constructorimplVar2 = constructorimplVar;
                        if (getpostalcode.read(constructorimplVar2)) {
                            i10 = 1048576;
                        }
                        i4 |= i10;
                    } else {
                        constructorimplVar2 = constructorimplVar;
                    }
                    i10 = Fields.BlendMode;
                    i4 |= i10;
                } else {
                    constructorimplVar2 = constructorimplVar;
                }
                i7 = 12582912 | i4;
                if ((100663296 & i) == 0) {
                    i7 = 46137344 | i4;
                }
                if ((805306368 & i) != 0) {
                    if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i7 |= i9;
                }
                if ((306783379 & i7) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i7 & 1, z2)) {
                    getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                    if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        if ((i2 & 2) != 0) {
                            i7 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i7 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        z3 = z;
                        i8 = i7 & (-234881025);
                        vertical3 = vertical2;
                        start = horizontal2;
                        isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
                    } else {
                        if ((i2 & 2) != 0) {
                            lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                            i7 &= -113;
                        }
                        if (i12 != 0) {
                            float fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
                            switchDefaults = new SwitchDefaults(fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl, fM3673constructorimpl);
                        }
                        if ((i2 & 16) != 0) {
                            vertical3 = Arrangement.MediaDescriptionCompat;
                            i7 &= -57345;
                        } else {
                            vertical3 = vertical2;
                        }
                        if (i5 != 0) {
                            start = Alignment.Companion.getStart();
                        } else {
                            start = horizontal2;
                        }
                        if ((i2 & 64) != 0) {
                            accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                            z4 = getpostalcode.read(accessanimatewithtarget);
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (!z4 || objComponentActivity == getCreditCardExpirationMonth.write) {
                                objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                                getpostalcode.write(objComponentActivity);
                            }
                            constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                            i7 &= -3670017;
                        }
                        i8 = i7 & (-234881025);
                        isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                        z3 = true;
                    }
                    getpostalcode.RemoteActionCompatParcelizer();
                    int i14 = i8 >> 3;
                    LazyListKt.LazyList(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, true, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, start, vertical3, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i14 & 3670016) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i14) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    z3 = z;
                    vertical3 = vertical2;
                    start = horizontal2;
                    isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new AccessibilityUtilKt(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, vertical3, start, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2);
                }
            }
            i4 |= 196608;
            horizontal2 = horizontal;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    constructorimplVar2 = constructorimplVar;
                    if (getpostalcode.read(constructorimplVar2)) {
                        i10 = 1048576;
                    }
                    i4 |= i10;
                } else {
                    constructorimplVar2 = constructorimplVar;
                }
                i10 = Fields.BlendMode;
                i4 |= i10;
            } else {
                constructorimplVar2 = constructorimplVar;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i7 & 1, z2)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if ((i2 & 2) != 0) {
                        lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                        i7 &= -113;
                    }
                    if (i12 != 0) {
                        float fM3673constructorimpl2 = Dp.m3673constructorimpl(0.0f);
                        switchDefaults = new SwitchDefaults(fM3673constructorimpl2, fM3673constructorimpl2, fM3673constructorimpl2, fM3673constructorimpl2);
                    }
                    if ((i2 & 16) != 0) {
                        vertical3 = Arrangement.MediaDescriptionCompat;
                        i7 &= -57345;
                    } else {
                        vertical3 = vertical2;
                    }
                    if (i5 != 0) {
                        start = Alignment.Companion.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                        z4 = getpostalcode.read(accessanimatewithtarget);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z4) {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        }
                        constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                        i7 &= -3670017;
                    }
                    i8 = i7 & (-234881025);
                    isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                    z3 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                        i7 &= -113;
                    }
                    if (i12 != 0) {
                        float fM3673constructorimpl3 = Dp.m3673constructorimpl(0.0f);
                        switchDefaults = new SwitchDefaults(fM3673constructorimpl3, fM3673constructorimpl3, fM3673constructorimpl3, fM3673constructorimpl3);
                    }
                    if ((i2 & 16) != 0) {
                        vertical3 = Arrangement.MediaDescriptionCompat;
                        i7 &= -57345;
                    } else {
                        vertical3 = vertical2;
                    }
                    if (i5 != 0) {
                        start = Alignment.Companion.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                        z4 = getpostalcode.read(accessanimatewithtarget);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z4) {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        }
                        constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                        i7 &= -3670017;
                    }
                    i8 = i7 & (-234881025);
                    isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                    z3 = true;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                int i15 = i8 >> 3;
                LazyListKt.LazyList(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, true, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, start, vertical3, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i15 & 3670016) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i15) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z3 = z;
                vertical3 = vertical2;
                start = horizontal2;
                isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AccessibilityUtilKt(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, vertical3, start, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2);
            }
        }
        i3 |= 384;
        switchDefaults = switchKt;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (getpostalcode.read(vertical2)) {
                }
                i4 |= i13;
            } else {
                vertical2 = vertical;
            }
            i4 |= i13;
        } else {
            vertical2 = vertical;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                horizontal2 = horizontal;
                if (getpostalcode.read(horizontal2)) {
                    i6 = Fields.RenderEffect;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    constructorimplVar2 = constructorimplVar;
                    if (getpostalcode.read(constructorimplVar2)) {
                        i10 = 1048576;
                    }
                    i4 |= i10;
                } else {
                    constructorimplVar2 = constructorimplVar;
                }
                i10 = Fields.BlendMode;
                i4 |= i10;
            } else {
                constructorimplVar2 = constructorimplVar;
            }
            i7 = 12582912 | i4;
            if ((100663296 & i) == 0) {
                i7 = 46137344 | i4;
            }
            if ((805306368 & i) != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i7 |= i9;
            }
            if ((306783379 & i7) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i7 & 1, z2)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0) {
                    if ((i2 & 2) != 0) {
                        lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                        i7 &= -113;
                    }
                    if (i12 != 0) {
                        float fM3673constructorimpl4 = Dp.m3673constructorimpl(0.0f);
                        switchDefaults = new SwitchDefaults(fM3673constructorimpl4, fM3673constructorimpl4, fM3673constructorimpl4, fM3673constructorimpl4);
                    }
                    if ((i2 & 16) != 0) {
                        vertical3 = Arrangement.MediaDescriptionCompat;
                        i7 &= -57345;
                    } else {
                        vertical3 = vertical2;
                    }
                    if (i5 != 0) {
                        start = Alignment.Companion.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                        z4 = getpostalcode.read(accessanimatewithtarget);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z4) {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        }
                        constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                        i7 &= -3670017;
                    }
                    i8 = i7 & (-234881025);
                    isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                    z3 = true;
                } else {
                    if ((i2 & 2) != 0) {
                        lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                        i7 &= -113;
                    }
                    if (i12 != 0) {
                        float fM3673constructorimpl5 = Dp.m3673constructorimpl(0.0f);
                        switchDefaults = new SwitchDefaults(fM3673constructorimpl5, fM3673constructorimpl5, fM3673constructorimpl5, fM3673constructorimpl5);
                    }
                    if ((i2 & 16) != 0) {
                        vertical3 = Arrangement.MediaDescriptionCompat;
                        i7 &= -57345;
                    } else {
                        vertical3 = vertical2;
                    }
                    if (i5 != 0) {
                        start = Alignment.Companion.getStart();
                    } else {
                        start = horizontal2;
                    }
                    if ((i2 & 64) != 0) {
                        accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                        z4 = getpostalcode.read(accessanimatewithtarget);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z4) {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        } else {
                            objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                            getpostalcode.write(objComponentActivity);
                        }
                        constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                        i7 &= -3670017;
                    }
                    i8 = i7 & (-234881025);
                    isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                    z3 = true;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                int i16 = i8 >> 3;
                LazyListKt.LazyList(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, true, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, start, vertical3, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i16 & 3670016) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i16) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z3 = z;
                vertical3 = vertical2;
                start = horizontal2;
                isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AccessibilityUtilKt(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, vertical3, start, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2);
            }
        }
        i4 |= 196608;
        horizontal2 = horizontal;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                constructorimplVar2 = constructorimplVar;
                if (getpostalcode.read(constructorimplVar2)) {
                    i10 = 1048576;
                }
                i4 |= i10;
            } else {
                constructorimplVar2 = constructorimplVar;
            }
            i10 = Fields.BlendMode;
            i4 |= i10;
        } else {
            constructorimplVar2 = constructorimplVar;
        }
        i7 = 12582912 | i4;
        if ((100663296 & i) == 0) {
            i7 = 46137344 | i4;
        }
        if ((805306368 & i) != 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i7 |= i9;
        }
        if ((306783379 & i7) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i7 & 1, z2)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if ((i2 & 2) != 0) {
                    lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                    i7 &= -113;
                }
                if (i12 != 0) {
                    float fM3673constructorimpl6 = Dp.m3673constructorimpl(0.0f);
                    switchDefaults = new SwitchDefaults(fM3673constructorimpl6, fM3673constructorimpl6, fM3673constructorimpl6, fM3673constructorimpl6);
                }
                if ((i2 & 16) != 0) {
                    vertical3 = Arrangement.MediaDescriptionCompat;
                    i7 &= -57345;
                } else {
                    vertical3 = vertical2;
                }
                if (i5 != 0) {
                    start = Alignment.Companion.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                    z4 = getpostalcode.read(accessanimatewithtarget);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z4) {
                        objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                        getpostalcode.write(objComponentActivity);
                    }
                    constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                    i7 &= -3670017;
                }
                i8 = i7 & (-234881025);
                isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                z3 = true;
            } else {
                if ((i2 & 2) != 0) {
                    lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                    i7 &= -113;
                }
                if (i12 != 0) {
                    float fM3673constructorimpl7 = Dp.m3673constructorimpl(0.0f);
                    switchDefaults = new SwitchDefaults(fM3673constructorimpl7, fM3673constructorimpl7, fM3673constructorimpl7, fM3673constructorimpl7);
                }
                if ((i2 & 16) != 0) {
                    vertical3 = Arrangement.MediaDescriptionCompat;
                    i7 &= -57345;
                } else {
                    vertical3 = vertical2;
                }
                if (i5 != 0) {
                    start = Alignment.Companion.getStart();
                } else {
                    start = horizontal2;
                }
                if ((i2 & 64) != 0) {
                    accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                    z4 = getpostalcode.read(accessanimatewithtarget);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z4) {
                        objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                        getpostalcode.write(objComponentActivity);
                    }
                    constructorimplVar2 = (notifyFocusedRectfoundation) objComponentActivity;
                    i7 &= -3670017;
                }
                i8 = i7 & (-234881025);
                isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                z3 = true;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            int i17 = i8 >> 3;
            LazyListKt.LazyList(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, true, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, start, vertical3, null, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i17 & 3670016) | (i8 & 14) | 24576 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (458752 & i17) | ((i8 << 12) & 1879048192), ((i8 >> 12) & 14) | ((i8 >> 18) & 7168), 6400);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z3 = z;
            vertical3 = vertical2;
            start = horizontal2;
            isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AccessibilityUtilKt(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, vertical3, start, constructorimplVar2, z3, isnotgestureactionfoundationSerializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, i2);
        }
    }

    public static final void RemoteActionCompatParcelizer(Modifier modifier, LazyListState lazyListState, SwitchDefaults switchDefaults, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, constructorimpl constructorimplVar, boolean z, isNotGestureActionfoundation isnotgestureactionfoundation, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        LazyListState lazyListState2;
        Alignment.Vertical vertical2;
        constructorimpl constructorimplVar2;
        isNotGestureActionfoundation isnotgestureactionfoundation2;
        LazyListState lazyListStateRemoteActionCompatParcelizer;
        Alignment.Vertical top;
        isNotGestureActionfoundation isnotgestureactionfoundationSerializer;
        int i3;
        constructorimpl constructorimplVar3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1884325601);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(switchDefaults) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= getpostalcode.read(horizontal) ? Fields.Clip : 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        int i6 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i6 = 46137344 | i5;
        }
        if ((805306368 & i) == 0) {
            i6 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 536870912 : 268435456;
        }
        boolean z2 = true;
        if (getpostalcode.write(i6 & 1, (306783379 & i6) != 306783378)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                lazyListStateRemoteActionCompatParcelizer = lazyListState;
                top = vertical;
                z2 = z;
                isnotgestureactionfoundationSerializer = isnotgestureactionfoundation;
                i3 = i6 & (-238551153);
                constructorimplVar3 = constructorimplVar;
            } else {
                lazyListStateRemoteActionCompatParcelizer = BasicTooltipKthandleGestures11.RemoteActionCompatParcelizer(getpostalcode);
                top = Alignment.Companion.getTop();
                accessanimateWithTarget accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode);
                boolean z3 = getpostalcode.read(accessanimatewithtarget);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new notifyFocusedRectfoundation(accessanimatewithtarget);
                    getpostalcode.write(objComponentActivity);
                }
                isnotgestureactionfoundationSerializer = PagerStaterequestScrollToPage1.serializer(getpostalcode);
                i3 = i6 & (-238551153);
                constructorimplVar3 = (notifyFocusedRectfoundation) objComponentActivity;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            LazyListKt.LazyList(modifier, lazyListStateRemoteActionCompatParcelizer, switchDefaults, false, constructorimplVar3, z2, isnotgestureactionfoundationSerializer, null, null, top, horizontal, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, (i3 & 14) | 24576 | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 3670016), ((i3 >> 12) & 112) | ((i3 >> 6) & 896) | ((i3 >> 18) & 7168), 1792);
            isNotGestureActionfoundation isnotgestureactionfoundation3 = isnotgestureactionfoundationSerializer;
            constructorimplVar2 = constructorimplVar3;
            lazyListState2 = lazyListStateRemoteActionCompatParcelizer;
            vertical2 = top;
            isnotgestureactionfoundation2 = isnotgestureactionfoundation3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            lazyListState2 = lazyListState;
            vertical2 = vertical;
            constructorimplVar2 = constructorimplVar;
            z2 = z;
            isnotgestureactionfoundation2 = isnotgestureactionfoundation;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new TooltipStateImplshow2(modifier, lazyListState2, switchDefaults, horizontal, vertical2, constructorimplVar2, z2, isnotgestureactionfoundation2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
        }
    }
}
