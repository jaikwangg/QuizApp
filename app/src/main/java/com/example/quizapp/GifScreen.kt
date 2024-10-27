import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.rememberAsyncImagePainter

@Composable
fun GifScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberAsyncImagePainter("https://media.giphy.com/media/11M1k4fIwVqPF6/giphy.gif"),
            contentDescription = "Jim Carrey GIF",
            modifier = Modifier.fillMaxSize()
        )
    }
}
