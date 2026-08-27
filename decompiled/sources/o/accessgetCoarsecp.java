package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetCoarsecp {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void serializer(float f, int i, int i2, long j, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        long jWrite;
        boolean z;
        androidx.compose.ui.Modifier modifier3;
        float f2;
        long j2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        int i4;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(75144485);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (getpostalcode.read(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                i3 |= getpostalcode.serializer(f) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                jWrite = j;
                if ((i2 & 4) == 0 || !getpostalcode.serializer(jWrite)) {
                    i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            } else {
                jWrite = j;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) != 0 || getpostalcode.PlaybackStateCompat()) {
                    if (i5 != 0) {
                        modifier3 = androidx.compose.ui.Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i6 != 0) {
                        f2 = accessgetFinecp.IconCompatParcelizer;
                    } else {
                        f2 = f;
                    }
                    if ((i2 & 4) != 0) {
                        float f3 = accessgetFinecp.IconCompatParcelizer;
                        i3 &= -897;
                        jWrite = getWindowPosturem18o9QQ.write(androidx.compose.material3.tokens.DividerTokens.read, getpostalcode);
                    }
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    f2 = f;
                }
                getpostalcode.RemoteActionCompatParcelizer();
                androidx.compose.ui.Modifier modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.foundation.layout.SizeKt.write(modifier3, 1.0f), f2);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = (((i3 & 896) ^ 384) <= 256 && getpostalcode.serializer(jWrite)) || (i3 & 384) == 256;
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z3 | z2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new UiMediaScopePointerPrecision(f2, jWrite, 1);
                    getpostalcode.write(objComponentActivity);
                }
                AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                f2 = f;
            }
            j2 = jWrite;
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(modifier3, f2, j2, i, i2);
            }
        }
        i3 |= 48;
        if ((i & 384) == 0) {
            jWrite = j;
            if ((i2 & 4) == 0) {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i3 |= i4;
        } else {
            jWrite = j;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    modifier3 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    f2 = accessgetFinecp.IconCompatParcelizer;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    float f4 = accessgetFinecp.IconCompatParcelizer;
                    i3 &= -897;
                    jWrite = getWindowPosturem18o9QQ.write(androidx.compose.material3.tokens.DividerTokens.read, getpostalcode);
                }
            } else {
                if (i5 != 0) {
                    modifier3 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    f2 = accessgetFinecp.IconCompatParcelizer;
                } else {
                    f2 = f;
                }
                if ((i2 & 4) != 0) {
                    float f5 = accessgetFinecp.IconCompatParcelizer;
                    i3 &= -897;
                    jWrite = getWindowPosturem18o9QQ.write(androidx.compose.material3.tokens.DividerTokens.read, getpostalcode);
                }
            }
            getpostalcode.RemoteActionCompatParcelizer();
            androidx.compose.ui.Modifier modifierM75height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.foundation.layout.SizeKt.write(modifier3, 1.0f), f2);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((i3 & 896) ^ 384) <= 256) {
            }
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!z3 && !z2) {
                objComponentActivity = new UiMediaScopePointerPrecision(f2, jWrite, 1);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new UiMediaScopePointerPrecision(f2, jWrite, 1);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifierM75height3ABfNKs2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            f2 = f;
        }
        j2 = jWrite;
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getFinefpxItnM(modifier3, f2, j2, i, i2);
        }
    }

    public static final void RemoteActionCompatParcelizer(float f, int i, long j, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1534852205);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.serializer(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.serializer(j) ? 256 : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        boolean z = true;
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            androidx.compose.ui.Modifier modifierM86width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(androidx.compose.foundation.layout.SizeKt.serializer(modifier, 1.0f), f);
            boolean z2 = (i2 & 112) == 32;
            if ((((i2 & 896) ^ 384) <= 256 || !getpostalcode.serializer(j)) && (i2 & 384) != 256) {
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new UiMediaScopePointerPrecision(f, j, 0);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifierM86width3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetBluntcp(modifier, f, j, i);
        }
    }
}
