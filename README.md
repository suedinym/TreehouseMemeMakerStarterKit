This is a rebuild of the Treehouse Meme maker (Android Data Persistence) Starter Kit.
https://teamtreehouse.com/library/android-data-persistence/introduction-to-data-persistence/introduction-to-the-starter-kit

I rebuilt it because the old one wouldn't build, due to two sections that needed to be replaced in the gradle files, but now the main UI has also been depricated.

It uses the Toolbar and sliding tabs, rather than the action bar and tabs.

I added 2 pictures (wonka and philosoraptor) and resized one of the originals. (I probably tweaked the colors some too.)

I did change it so it runs on api 14, instead of 16. There is one line in the code that requires api 16. It is currently commented out.

---- This was built on my xubuntu 14.04 development machine which is running ---
java version "1.8.0_66"
Android studio 1.4

--------- from original treehouse readme.md ---------
#Meme Maker - Features implemented since they don't include data persistence

####Basic Features

* Show gallery of images
* Edit images with text
* Ability to share those memes after editing


#####Gallery Features
* Import new images to work with.
* Show current images in a grid.
* Clicking on them brings them up into full screen edit mode. With additional options.

#####Image View Features
* Allows you to CRUD
* Create a new one with the image.
* Update a current meme's text with the image.
* Delete a current meme.
* Delete an image which will delete all the other memes.

#####Image View Sharing Features
* Shares images to several avenues.

------- end ---------
Below is the method that should be in the Teacher Notes, but isn't.
https://teamtreehouse.com/community/method-that-should-be-in-the-teacher-notes

   private static void copyFile(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int read;
        while((read = in.read(buffer)) != -1) {
            out.write(buffer, 0, read);
        }
    }

