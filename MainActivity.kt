package com.example.bai1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bai1.ui.theme.Bai1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Bai1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaoThangInfo()

                }
            }
        }
    }
}

@Composable
fun CaoThangInfo(modifier:Modifier=Modifier){
    Column (modifier=modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = painterResource(id = R.drawable.caothang),
            contentDescription = null,
            modifier=modifier.fillMaxWidth()
            )
        TitleSection()
        IconSection()
        ContentSection()
    }
}
@Composable
fun TitleSection(modifier: Modifier= Modifier){
    Box(modifier=modifier.padding(all=12.dp)){
        Row(
            modifier=modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically){
        Column {
            Text(text = "trường cao đẳng cao thắng ",
                fontWeight = FontWeight.Bold)
            Text(text = "65 huỳnh thúc kháng",
                color = Color.Gray)
        }
            Icon(Icons.Rounded.FavoriteBorder,
                    contentDescription = "hj"

            )
        }

    }
    }
@Composable
fun Iconchild(icon:ImageVector,lable:String="",iconColor:Color= Color.Black){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon( icon,
            contentDescription = lable,
            tint=iconColor)
        Text(text=lable.uppercase())
    }
}
@Composable
fun IconSection(modifier: Modifier=Modifier){
    Row(
        modifier=modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly){
        Iconchild(Icons.Filled.Call,"call")
        Iconchild(Icons.Filled.LocationOn,"direction", Color.Blue)
        Iconchild(Icons.Filled.Share,"share", Color.Green)
    }
}
@Composable
fun ContentSection(modifier: Modifier=Modifier){
    Box(modifier = modifier.padding(12.dp)){
        Text(text = "  Trường Cao đẳng Kỹ thuật Cao Thắng ban " +
                "đầu có tên là Trường Cơ khí Á Châu " +
                "(L’école des Mécaniciens Asiatiques), tên thường gọi là Trường Bá" +
                " Nghệ. Trường được thành lập theo Nghị định của toàn quyền Đông " +
                "Dương ngày 20/2/1906 nhằm “đào tạo cho nhu cầu hàng hải thương " +
                "thuyền cho nền cai trị thuộc địa và kỹ nghệ địa phương, một đội " +
                "ngũ thợ cơ khí vững tay nghề về máy móc sử dụng trên tàu và trên đất liền” ." +
                " Đây là một trong những trường dạy nghề đầu tiên ở Nam Bộ. Trường vinh dự " +
                "là nơi Bác Hồ (năm 1911) và Bác Tôn (năm 1915-1917) đã từng theo học," +
                " và cũng từ ngôi trường này, nhiều thế hệ cựu học sinh đã trở thành những " +
                "cán bộ lãnh đạo, quản lý giỏi, những chuyên viên kỹ thuật hàng đầu, những " +
                "người thợ có tay nghề xuất sắc, một số được Nhà nước phong tặng danh hiệu" +
                " “Anh hùng lao động”.",
            softWrap = true,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CaoThangInfoPreview(modifier: Modifier=Modifier){
    CaoThangInfo()
}