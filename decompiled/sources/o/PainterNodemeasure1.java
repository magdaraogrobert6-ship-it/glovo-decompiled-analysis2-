package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class PainterNodemeasure1 {
    public static final boolean[] write = new boolean[3];

    public static void serializer(getUseIntrinsicSize getuseintrinsicsize, DrawWithContentElement drawWithContentElement, setAlignment setalignment) {
        setalignment.getSavedStateRegistryControllerannotations = -1;
        paintdefault paintdefaultVar = setalignment.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr = setalignment.addOnNewIntentListener;
        paintdefault paintdefaultVar2 = setalignment.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        paintdefault paintdefaultVar3 = setalignment.onActivityResult;
        paintdefault paintdefaultVar4 = setalignment.invalidateMenu;
        paintdefault paintdefaultVar5 = setalignment.onBackPressedDispatcher_delegatelambda010;
        setalignment.onNewIntent = -1;
        hasSpecifiedAndFiniteHeightuvyYCjk[] hasspecifiedandfiniteheightuvyycjkArr2 = getuseintrinsicsize.addOnNewIntentListener;
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = hasspecifiedandfiniteheightuvyycjkArr2[0];
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = hasSpecifiedAndFiniteHeightuvyYCjk.WRAP_CONTENT;
        if (hasspecifiedandfiniteheightuvyycjk != hasspecifiedandfiniteheightuvyycjk2 && hasspecifiedandfiniteheightuvyycjkArr[0] == hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT) {
            int i = paintdefaultVar5.IconCompatParcelizer;
            int iMediaSessionCompatQueueItem = getuseintrinsicsize.MediaSessionCompatQueueItem() - paintdefaultVar4.IconCompatParcelizer;
            paintdefaultVar5.MediaMetadataCompat = drawWithContentElement.write(paintdefaultVar5);
            paintdefaultVar4.MediaMetadataCompat = drawWithContentElement.write(paintdefaultVar4);
            drawWithContentElement.read(paintdefaultVar5.MediaMetadataCompat, i);
            drawWithContentElement.read(paintdefaultVar4.MediaMetadataCompat, iMediaSessionCompatQueueItem);
            setalignment.getSavedStateRegistryControllerannotations = 2;
            setalignment.onPictureInPictureModeChanged = i;
            int i2 = iMediaSessionCompatQueueItem - i;
            setalignment.onPanelClosed = i2;
            int i3 = setalignment.getFullyDrawnReporter;
            if (i2 < i3) {
                setalignment.onPanelClosed = i3;
            }
        }
        if (hasspecifiedandfiniteheightuvyycjkArr2[1] == hasspecifiedandfiniteheightuvyycjk2 || hasspecifiedandfiniteheightuvyycjkArr[1] != hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_PARENT) {
            return;
        }
        int i4 = paintdefaultVar3.IconCompatParcelizer;
        int iMediaDescriptionCompat = getuseintrinsicsize.MediaDescriptionCompat() - paintdefaultVar2.IconCompatParcelizer;
        paintdefaultVar3.MediaMetadataCompat = drawWithContentElement.write(paintdefaultVar3);
        paintdefaultVar2.MediaMetadataCompat = drawWithContentElement.write(paintdefaultVar2);
        drawWithContentElement.read(paintdefaultVar3.MediaMetadataCompat, i4);
        drawWithContentElement.read(paintdefaultVar2.MediaMetadataCompat, iMediaDescriptionCompat);
        if (setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ > 0 || setalignment.onMultiWindowModeChanged == 8) {
            setBlockui setblockuiWrite = drawWithContentElement.write(paintdefaultVar);
            paintdefaultVar.MediaMetadataCompat = setblockuiWrite;
            drawWithContentElement.read(setblockuiWrite, setalignment.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + i4);
        }
        setalignment.onNewIntent = 2;
        setalignment.onRetainNonConfigurationInstance = i4;
        int i5 = iMediaDescriptionCompat - i4;
        setalignment.addObserverForBackInvoker = i5;
        int i6 = setalignment.getDefaultViewModelCreationExtras;
        if (i5 < i6) {
            setalignment.addObserverForBackInvoker = i6;
        }
    }

    public static final boolean serializer(int i, int i2) {
        return (i & i2) == i2;
    }
}
