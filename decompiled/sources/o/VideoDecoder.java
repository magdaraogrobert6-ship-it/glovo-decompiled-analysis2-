package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoDecoder extends VideoDecoderVideoDecoderException {
    @Override // o.VideoDecoderVideoDecoderException
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // o.VideoDecoderVideoDecoderException, o.HttpUrlFetcher
    public final ThumbFetcher MediaDescriptionCompat(RecyclableBufferedInputStream recyclableBufferedInputStream) {
        RecyclableBufferedInputStream recyclableBufferedInputStreamIconCompatParcelizer;
        recyclableBufferedInputStream.getClass();
        java.nio.file.Path path = Paths.get(recyclableBufferedInputStream.bytes.RatingCompat(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            java.nio.file.Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = RecyclableBufferedInputStream.DIRECTORY_SEPARATOR;
                recyclableBufferedInputStreamIconCompatParcelizer = Path$Companion.IconCompatParcelizer(symbolicLink.toString());
            } else {
                recyclableBufferedInputStreamIconCompatParcelizer = null;
            }
            long size = attributes.size();
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lSerializer = fileTimeCreationTime != null ? serializer(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lSerializer2 = fileTimeLastModifiedTime != null ? serializer(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new ThumbFetcher(zIsRegularFile, zIsDirectory, recyclableBufferedInputStreamIconCompatParcelizer, Long.valueOf(size), lSerializer, lSerializer2, fileTimeLastAccessTime != null ? serializer(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // o.VideoDecoderVideoDecoderException, o.HttpUrlFetcher
    public final void write(RecyclableBufferedInputStream recyclableBufferedInputStream, RecyclableBufferedInputStream recyclableBufferedInputStream2) throws IOException {
        recyclableBufferedInputStream.getClass();
        recyclableBufferedInputStream2.getClass();
        try {
            java.nio.file.Path path = Paths.get(recyclableBufferedInputStream.bytes.RatingCompat(), new String[0]);
            path.getClass();
            java.nio.file.Path path2 = Paths.get(recyclableBufferedInputStream2.bytes.RatingCompat(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    public static Long serializer(FileTime fileTime) {
        long millis = fileTime.toMillis();
        if (millis != 0) {
            return Long.valueOf(millis);
        }
        return null;
    }
}
