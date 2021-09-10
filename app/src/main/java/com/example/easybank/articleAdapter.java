package com.example.easybank;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class articleAdapter extends RecyclerView.Adapter<articleAdapter.ViewHolder> {

    ArrayList<Article> article = new ArrayList<>();

    private Context context;

    public articleAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public articleAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_article_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull articleAdapter.ViewHolder holder, int position) {
        holder.articleImage.setImageResource(article.get(position).getImageView());
        holder.articleAuthor.setText(article.get(position).getAuthor());
        holder.articleHead.setText(article.get(position).getHeadline());
        holder.articleDesc.setText(article.get(position).getDesc());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return article.size();
    }

    public void setArticle(ArrayList<Article> article) {
        this.article = article;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView articleImage;
        private TextView articleHead, articleAuthor, articleDesc;
        private CardView parent;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            articleImage = itemView.findViewById(R.id.articleImage);
            articleHead = itemView.findViewById(R.id.articleHead);
            articleAuthor = itemView.findViewById(R.id.articleAuthor);
            articleDesc = itemView.findViewById(R.id.articleDesc);
            parent = itemView.findViewById(R.id.Articleparent);
        }
    }


}