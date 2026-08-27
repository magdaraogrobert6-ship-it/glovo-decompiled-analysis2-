package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Iconww6aTOc {
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void serializer(androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment alignment, boolean z, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Alignment alignment2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Alignment topStart;
        final boolean z4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        androidx.compose.ui.layout.MeasurePolicy measurePolicy;
        boolean z5;
        boolean z6;
        Object objComponentActivity;
        int i7;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(380139498);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                alignment2 = alignment;
                i3 |= getpostalcode.read(alignment2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (getpostalcode.write(z2)) {
                        i5 = androidx.compose.ui.graphics.Fields.RotationX;
                    } else {
                        i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i7 = 2048;
                    } else {
                        i7 = androidx.compose.ui.graphics.Fields.RotationZ;
                    }
                    i3 |= i7;
                }
                i6 = 0;
                if ((i3 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getpostalcode.write(i3 & 1, z3)) {
                    if (i8 != 0) {
                        modifier2 = androidx.compose.ui.Modifier.Companion;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i9 != 0) {
                        topStart = androidx.compose.ui.Alignment.Companion.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    measurePolicy = androidx.compose.foundation.layout.BoxKt.read(topStart, z2);
                    z5 = (i3 & 7168) == 2048;
                    z6 = getpostalcode.read(measurePolicy);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(z6 | z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                        getpostalcode.write(objComponentActivity);
                    }
                    androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(modifier2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode, i3 & 14, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier2 = modifier;
                    topStart = alignment2;
                }
                z4 = z2;
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.Content
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            Iconww6aTOc.serializer(modifier2, topStart, z4, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i7 = 2048;
                } else {
                    i7 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
                i3 |= i7;
            }
            i6 = 0;
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i8 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier2 = modifier;
                }
                if (i9 != 0) {
                    topStart = androidx.compose.ui.Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                measurePolicy = androidx.compose.foundation.layout.BoxKt.read(topStart, z2);
                if ((i3 & 7168) == 2048) {
                }
                z6 = getpostalcode.read(measurePolicy);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z6 | z5)) {
                    objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                    getpostalcode.write(objComponentActivity);
                }
                androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(modifier2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode, i3 & 14, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                topStart = alignment2;
            }
            z4 = z2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.Content
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        Iconww6aTOc.serializer(modifier2, topStart, z4, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        alignment2 = alignment;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (getpostalcode.write(z2)) {
                    i5 = androidx.compose.ui.graphics.Fields.RotationX;
                } else {
                    i5 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i7 = 2048;
                } else {
                    i7 = androidx.compose.ui.graphics.Fields.RotationZ;
                }
                i3 |= i7;
            }
            i6 = 0;
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i8 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier2 = modifier;
                }
                if (i9 != 0) {
                    topStart = androidx.compose.ui.Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i4 != 0) {
                    z2 = false;
                }
                measurePolicy = androidx.compose.foundation.layout.BoxKt.read(topStart, z2);
                if ((i3 & 7168) == 2048) {
                }
                z6 = getpostalcode.read(measurePolicy);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z6 | z5)) {
                    objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                    getpostalcode.write(objComponentActivity);
                }
                androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(modifier2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode, i3 & 14, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                topStart = alignment2;
            }
            z4 = z2;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.Content
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        Iconww6aTOc.serializer(modifier2, topStart, z4, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i7 = 2048;
            } else {
                i7 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i3 |= i7;
        }
        i6 = 0;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i3 & 1, z3)) {
            if (i8 != 0) {
                modifier2 = androidx.compose.ui.Modifier.Companion;
            } else {
                modifier2 = modifier;
            }
            if (i9 != 0) {
                topStart = androidx.compose.ui.Alignment.Companion.getTopStart();
            } else {
                topStart = alignment2;
            }
            if (i4 != 0) {
                z2 = false;
            }
            measurePolicy = androidx.compose.foundation.layout.BoxKt.read(topStart, z2);
            if ((i3 & 7168) == 2048) {
            }
            z6 = getpostalcode.read(measurePolicy);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z6 | z5)) {
                objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new MinimumInteractiveModifierNode(measurePolicy, i6, dragAndDropTargetModifierNode);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(modifier2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity, getpostalcode, i3 & 14, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            topStart = alignment2;
        }
        z4 = z2;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.Content
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    Iconww6aTOc.serializer(modifier2, topStart, z4, dragAndDropTargetModifierNode, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
