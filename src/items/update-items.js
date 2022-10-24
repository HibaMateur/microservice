/* eslint-disable */
import React, { useState, useEffect } from "react";
import Axios from "axios";
import { useParams } from "react-router";

import { Form, Input, Button } from "antd";
const UpdateItems = () => {
  const { id } = useParams();

  const [newName, setnewName] = useState("");
  const [newDescription, setnewDescription] = useState("");

  const [itemsList, setItemsList] = useState([]);
  const [items, setItems] = useState([]);
  const UpdateItems = async (id) => {
    //{object}

    Axios.put(`http://localhost:3001/items/updateItems/${id}`, {
      name: newName,
      description: newDescription,

      _id: id.id,
    }).then(async (response) => {
      console.log(response.data);
      setItemsList(
        itemsList.map((val) => {
          return val._id === id
            ? {
                _id: val._id,
                name: newName,
                description: newDescription,
                price: newPrice,
                stock: newStock,
              }
            : val;
        })
      );
    });
  };
  const getItems = async (id) => {
    Axios.get(`http://localhost:3001/items/getItemsById/${id}`).then(
      async (res) => {
        setItems(res.data);
      }
    );
  };

  useEffect(() => {
    UpdateItems(id);

    if (id) {
      getItems(id);
    }
  }, [id]);

  return (
    <div>
      {" "}
      <center>
        <div style={{ marginBottom: "2%", marginTop: "2%" }}>Update Items</div>
        <Form
          name="basic"
          initialValues={{ remember: true }}
          wrapperCol={{ span: 14 }}
          labelCol={{ span: 4 }}
          autoComplete="off"
        >
          <Form.Item
            label="name"
            name="name"
            rules={[{ required: true, message: "Please input your name!" }]}
          >
            <Input
              placeholder={items.name}
              type="text"
              onChange={(e) => {
                setnewName(e.target.value);
              }}
            />
          </Form.Item>
          <Form.Item
            label="lastname"
            name="lastname"
            rules={[
              { required: true, message: "Please input your description!" },
            ]}
          >
            <Input
              placeholder={items.description}
              type="text"
              onChange={(e) => {
                setnewDescription(e.target.value);
              }}
            />
          </Form.Item>

          <Button onClick={(e) => UpdateItems(id)}>update authors</Button>
        </Form>
      </center>
    </div>
  );
};
export default UpdateItems;
