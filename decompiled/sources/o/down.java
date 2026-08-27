package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class down {
    public int read;
    public Object serializer;
    public final Object write;

    public int RemoteActionCompatParcelizer(Object obj) {
        AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.write;
        int iSerializer = anchoredDraggableState.serializer(obj);
        if (iSerializer >= 0) {
            return anchoredDraggableState.MediaMetadataCompat[iSerializer];
        }
        return -1;
    }

    public TextFieldImplKtCommonDecorationBox3containerWithId1 write(int i) {
        if (i < 0 || i >= this.read) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", ", size ");
            sbM.append(this.read);
            TriStateCheckbox.serializer(sbM.toString());
        }
        TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1 = (TextFieldImplKtCommonDecorationBox3containerWithId1) this.serializer;
        if (textFieldImplKtCommonDecorationBox3containerWithId1 != null) {
            int i2 = textFieldImplKtCommonDecorationBox3containerWithId1.serializer;
            if (i < textFieldImplKtCommonDecorationBox3containerWithId1.read + i2 && i2 <= i) {
                return textFieldImplKtCommonDecorationBox3containerWithId1;
            }
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) this.write;
        TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId2 = (TextFieldImplKtCommonDecorationBox3containerWithId1) oncreatevirtualviewtranslationrequests.write[TextFieldImplKtCommonDecorationBox3borderContainerWithId1.RemoteActionCompatParcelizer(i, oncreatevirtualviewtranslationrequests)];
        this.serializer = textFieldImplKtCommonDecorationBox3containerWithId2;
        return textFieldImplKtCommonDecorationBox3containerWithId2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    public down(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, AbstractApplier abstractApplier) {
        Object defaultLazyKey;
        down downVar = abstractApplier.read();
        int i = ensuresubscribedtoinappmessageeventslambda7.write;
        if (i < 0) {
            TriStateCheckbox.RemoteActionCompatParcelizer("negative nearestRange.first");
        }
        int iMin = Math.min(ensuresubscribedtoinappmessageeventslambda7.read, downVar.read - 1);
        if (iMin < i) {
            AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
            anchoredDraggableState.getClass();
            this.write = anchoredDraggableState;
            this.serializer = new Object[0];
            this.read = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.serializer = new Object[i2];
        this.read = i;
        AnchoredDraggableState anchoredDraggableState2 = new AnchoredDraggableState(i2);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = (onCreateVirtualViewTranslationRequests) downVar.write;
        if (i < 0 || i >= downVar.read) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Index ", ", size ");
            sbM.append(downVar.read);
            TriStateCheckbox.serializer(sbM.toString());
        }
        if (iMin < 0 || iMin >= downVar.read) {
            StringBuilder sbM2 = ff$$ExternalSyntheticOutline0.m(iMin, "Index ", ", size ");
            sbM2.append(downVar.read);
            TriStateCheckbox.serializer(sbM2.toString());
        }
        if (iMin < i) {
            TriStateCheckbox.read("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iRemoteActionCompatParcelizer = TextFieldImplKtCommonDecorationBox3borderContainerWithId1.RemoteActionCompatParcelizer(i, oncreatevirtualviewtranslationrequests);
        int i3 = ((TextFieldImplKtCommonDecorationBox3containerWithId1) oncreatevirtualviewtranslationrequests.write[iRemoteActionCompatParcelizer]).serializer;
        while (i3 <= iMin) {
            TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1 = (TextFieldImplKtCommonDecorationBox3containerWithId1) oncreatevirtualviewtranslationrequests.write[iRemoteActionCompatParcelizer];
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer = textFieldImplKtCommonDecorationBox3containerWithId1.write.serializer();
            int i4 = textFieldImplKtCommonDecorationBox3containerWithId1.serializer;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (textFieldImplKtCommonDecorationBox3containerWithId1.read + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer != null) {
                        defaultLazyKey = r8lambdaunavo3sxub_pc9xroryotnrlvsmSerializer.invoke(Integer.valueOf(iMax - i4));
                        defaultLazyKey = defaultLazyKey == null ? new androidx.compose.foundation.lazy.layout.DefaultLazyKey(iMax) : defaultLazyKey;
                    }
                    anchoredDraggableState2.write(iMax, defaultLazyKey);
                    ((Object[]) this.serializer)[iMax - this.read] = defaultLazyKey;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += textFieldImplKtCommonDecorationBox3containerWithId1.read;
            iRemoteActionCompatParcelizer++;
        }
        this.write = anchoredDraggableState2;
    }

    public void read(int i, PullToRefreshBox pullToRefreshBox) {
        if (i < 0) {
            TriStateCheckbox.read("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        TextFieldImplKtCommonDecorationBox3containerWithId1 textFieldImplKtCommonDecorationBox3containerWithId1 = new TextFieldImplKtCommonDecorationBox3containerWithId1(this.read, i, pullToRefreshBox);
        this.read += i;
        ((onCreateVirtualViewTranslationRequests) this.write).IconCompatParcelizer(textFieldImplKtCommonDecorationBox3containerWithId1);
    }

    public down() {
        this.write = new onCreateVirtualViewTranslationRequests(new TextFieldImplKtCommonDecorationBox3containerWithId1[16]);
    }
}
