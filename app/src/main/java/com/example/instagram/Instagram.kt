package com.example.instagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Preview(showBackground = true)
@Composable
fun InstargramView() {
    Instagram()
    //InstagramTopBar2()
}

@Composable
fun Instagram(
    modifier: Modifier = Modifier,
) {
    // 전체
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        // 1줄
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            // 1줄 - 1칸
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                /*Text(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(10.dp),             // 패딩 10dp
                    fontSize = 23.sp, text = "Instagram"
                )*/
                Image(
                    painter = painterResource(id = R.drawable.instagram_logo),
                    contentDescription = "Description",
                    modifier = Modifier
                        //.size(100.dp)
                        .width(150.dp)
                        .padding(10.dp)


                )
            }
            // 더하기 좋아요 메신저
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End // 오른쪽 정렬
            ) {
                // 버튼 1번
                IconButton(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(3.dp),
                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
                // 버튼 2번
                IconButton(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(3.dp),


                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }

                // 버튼 3번
                IconButton(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(3.dp),

                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
            }
        }

        // 2줄(릴스)
        LazyRow(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterHorizontally),
            contentPadding = PaddingValues(horizontal = 10.dp)
        ) {
            items(8) {

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    IconButton(
                        modifier = Modifier
                            .size(80.dp),
                        onClick = { }
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aaaa),
                            contentDescription = "Description",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(150.dp)

                        )

                    /*Icon(
                            imageVector = Icons.Outlined.Notifications,
                            contentDescription = null,
                            tint = Color.Black,

                        )*/
                    }
                    Text(
                        modifier = Modifier
                            .background(Color.White)  // 배경 노란색
                            .padding(5.dp)             // 패딩 10dp
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally),
                        fontSize = 15.sp, text = "joon"
                    )
                }

            }
        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()     // 선 길이
                .padding(vertical = 5.dp),    // 선 위아래 패딩
            color = Color.Black,     // 선 색깔
            thickness = 0.8.dp       // 선 굵기
        )
        // 3줄 피드
        LazyColumn(content = {
            items(2) { index ->
                // 3줄 - 1칸
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // 선
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth(),     // 선 길이
                        // .padding(5.dp),    // 선 위아래 패딩
                        color = Color.Black,     // 선 색깔
                        thickness = 0.8.dp       // 선 굵기
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween //
                    ) {
                        // 프로필, 이름
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Start // 왼쪽 정렬
                        )
                        {
                            /*IconButton(
                                modifier = androidx.compose.ui.Modifier
                                    .size(20.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    imageVector = androidx.compose.material.icons.Icons.Outlined.Notifications,
                                    contentDescription = null,
                                    tint = androidx.compose.ui.graphics.Color.Black
                                )
                            }*/
                            Image(
                                painter = painterResource(id = R.drawable.aaaa),
                                contentDescription = "Description",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(10.dp)
                                    .clip(CircleShape)
                                    .size(40.dp)
                            )
                            androidx.compose.material3.Text(
                                modifier = androidx.compose.ui.Modifier
                                    .background(androidx.compose.ui.graphics.Color.White)
                                    .padding(1.dp),             // 패딩 10dp
                                fontSize = 20.sp,
                                text = "joonyong_park"
                            )
                        }
                        // 더보기
                        /*IconButton(
                            modifier = androidx.compose.ui.Modifier
                                .size(20.dp),

                            onClick = { }
                        ) {
                            Icon(
                                imageVector = androidx.compose.material.icons.Icons.Outlined.Notifications,
                                contentDescription = null,
                                tint = androidx.compose.ui.graphics.Color.Black
                            )
                        }*/
                        // 더보기
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.End //
                        ) {
                            // 왼쪽 정렬하고 싶은 아이콘
                            Row(
                                modifier = Modifier
                                    .padding(5.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                IconButton(
                                    modifier = Modifier.size(20.dp),
                                    onClick = { }
                                ) {
                                    Icon(
                                        imageVector = Icons.Outlined.Notifications,
                                        contentDescription = null,
                                        tint = Color.Black
                                    )
                                }
                            }

                        }
                    }

                    // 이미지 출력
                    /*LazyRow(
                        modifier = modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        // 버튼 1번
                        items(5) {
                            IconButton(
                                modifier = Modifier
                                    .size(80.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.aaaa), // 'your_image'를 실제 이미지 리소스 이름으로 바꿔주세요.
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                                // 사진 출력

                            }
                        }
                    }*/
                    // 2줄(릴스)
                    LazyRow(
                        modifier = modifier
                            .fillMaxWidth()
                            .background(Color.White),
                        verticalAlignment = Alignment.CenterVertically,
                        //horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        items(3) {
                            Image(
                                painter = painterResource(id = R.drawable.aaaa),
                                contentDescription = stringResource(id = R.string.app_name),
                                contentScale = ContentScale.Fit,    // 가로 꽉 채우기
                                modifier = Modifier
                                    .fillMaxWidth() // 가로 꽉 채우기
                                    .padding(0.dp)
                                    .size(500.dp)
                                    .pointerInput(Unit) {
                                        detectTapGestures(
                                            onDoubleTap = {
                                                // 좋아요.
                                            },
                                        )
                                    }
                            )

                            /* IconButton(
                                modifier = Modifier
                                   // .align(Alignment.CenterVertically)
                                    //.painterInput(Unit),

                                        .size(200.dp),
                                onClick = { }
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.aaaa),
                                    contentDescription = "Description"
                                )
                            }*/
                        }
                    }

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween //
                    ) {

                        // 좋아요, 댓글, 공유
                        Row(
                            modifier = Modifier
                                .padding(10.dp),             // 패딩 10dp
                            horizontalArrangement = Arrangement.Start // 왼쪽 정렬
                        ) {
                            IconButton(
                                modifier = Modifier.size(20.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }

                            IconButton(
                                modifier = Modifier.size(20.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }

                            IconButton(
                                modifier = Modifier.size(20.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }
                        // 북마크
                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End 
                        ) {
                            IconButton(
                                modifier = Modifier.size(20.dp),
                                onClick = { }
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.Notifications,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }

                    }

                }
                Text(
                    modifier = Modifier
                        .background(Color.White)
                        .padding(11.dp),
                    fontSize = 15.sp,
                    text = "2022 views\n미니언 입니다."
                )
            }
        })
    }
}










@Composable
fun InstagramTopBar2(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        LazyRow(
            modifier = modifier.fillMaxWidth(),
            // 세로길이 가운데 정렬



            verticalAlignment = Alignment.CenterVertically,

        ) {
            items(3) {  // 피드 갯수
                IconButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(80.dp),

                    onClick = { }
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Notifications,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
            }
        }
    }
}

