package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getCurrent implements alpha, AlphaKt {
    public final getShape IconCompatParcelizer;
    public final relocationOffsetfbGrOKE RemoteActionCompatParcelizer;
    public final AlphaKt serializer;

    @Override // o.AlphaKt
    public final void IconCompatParcelizer(Object obj) {
        this.serializer.IconCompatParcelizer(obj);
    }

    @Override // o.alpha
    public final boolean canBeSaved(Object obj) {
        return this.IconCompatParcelizer.canBeSaved(obj);
    }

    @Override // o.alpha
    public final Object consumeRestored(String str) {
        return this.IconCompatParcelizer.consumeRestored(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // o.alpha
    public final Map performSave() {
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.RemoteActionCompatParcelizer;
        Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
        long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.serializer.IconCompatParcelizer(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.IconCompatParcelizer.performSave();
    }

    @Override // o.alpha
    public final BlockDropShadowElement registerProvider(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return this.IconCompatParcelizer.registerProvider(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    public getCurrent(alpha alphaVar, Map map, AlphaKt alphaKt) {
        InlineChildren inlineChildren = new InlineChildren(11, alphaVar);
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = getBlock.read;
        this.IconCompatParcelizer = new getShape(map, inlineChildren);
        this.serializer = alphaKt;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = new relocationOffsetfbGrOKE();
    }

    @Override // o.AlphaKt
    public final void read(Object obj, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-858296452);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(this) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            this.serializer.read(obj, dragAndDropTargetModifierNode, getpostalcode, i2 & 126);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(this);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(obj);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new waitForFirstLayout(this, 18, obj);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(obj, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 2, this, obj, dragAndDropTargetModifierNode);
        }
    }
}
